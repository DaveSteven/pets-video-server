package com.pets.video.controller;

import com.pets.video.common.ServerResponse;
import com.pets.video.data.entity.User;
import com.pets.video.service.IUserService;
import com.pets.video.utils.MD5Utils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(value="用户注册登录", tags = "注册登录接口")
public class RegisterLoginController {

    @Resource
    private IUserService iUserService;

    @ApiOperation(value = "用户注册")
    @PostMapping("/register")
    public ServerResponse register(@RequestBody User user) throws Exception {

        if (StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(user.getPassword())) {
            return ServerResponse.createByErrorMessage("用户名或密码不能为空！");
        }

        boolean usernameIsExist = iUserService.queryUsernameIsExist(user.getUsername());

        if (!usernameIsExist) {
            user.setNickname(user.getUsername());
            user.setPassword(MD5Utils.getMD5Str(user.getPassword()));
            user.setFansCounts(0);
            user.setReceiveLikeCounts(0);
            user.setFollowCounts(0);
            iUserService.saveUser(user);
        } else {
            return ServerResponse.createByErrorMessage("用户名已存在！");
        }
        user.setPassword(null);
        return ServerResponse.createBySuccess(user);
    }

    @ApiOperation(value = "用户登录")
    @PostMapping("/login")
    public ServerResponse login(@RequestBody User user) throws Exception {

        boolean usernameIsExist = iUserService.queryUsernameIsExist(user.getUsername());

        if (usernameIsExist) {
            User result = iUserService.getUser(user.getUsername());
            String passwordMD5 = MD5Utils.getMD5Str(user.getPassword());
            if (passwordMD5.equals(result.getPassword())) {
                result.setPassword(null);
                return ServerResponse.createBySuccess(result);
            } else {
                return ServerResponse.createByErrorMessage("密码错误！");
            }
        }

        return ServerResponse.createByErrorMessage("用户不存在！");
    }
}
