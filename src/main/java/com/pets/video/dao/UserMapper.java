package com.pets.video.dao;

import com.pets.video.data.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    User selectByUsername(User user);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}