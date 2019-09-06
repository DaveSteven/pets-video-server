package com.pets.video.dao;

import com.pets.video.data.entity.UserFans;

public interface UserFansMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserFans record);

    int insertSelective(UserFans record);

    UserFans selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserFans record);

    int updateByPrimaryKey(UserFans record);
}