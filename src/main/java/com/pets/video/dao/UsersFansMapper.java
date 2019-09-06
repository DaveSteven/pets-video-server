package com.pets.video.dao;

import com.pets.video.data.entity.UsersFans;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersFansMapper {
    int deleteByPrimaryKey(String id);

    int insert(UsersFans record);

    int insertSelective(UsersFans record);

    UsersFans selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UsersFans record);

    int updateByPrimaryKey(UsersFans record);
}