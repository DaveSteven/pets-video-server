package com.pets.video.service.impl;

import com.pets.video.dao.UserMapper;
import com.pets.video.data.entity.User;
import com.pets.video.service.IUserService;
import org.n3r.idworker.Sid;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("IUserService")
public class IUserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private Sid sid;

    @Transactional(propagation = Propagation.SUPPORTS)
    public boolean queryUsernameIsExist(String username) {
        User user = new User();
        user.setUsername(username);
        User result = userMapper.selectByUsername(user);
        return result != null;
    }

    public User getUser(String username) {
        User user = new User();
        user.setUsername(username);
        return userMapper.selectByUsername(user);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void saveUser(User user) {
        String userId = sid.nextShort();
        user.setId(userId);
        userMapper.insert(user);
    }
}
