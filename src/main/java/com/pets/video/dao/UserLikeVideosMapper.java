package com.pets.video.dao;

import com.pets.video.data.entity.UserLikeVideos;

public interface UserLikeVideosMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserLikeVideos record);

    int insertSelective(UserLikeVideos record);

    UserLikeVideos selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserLikeVideos record);

    int updateByPrimaryKey(UserLikeVideos record);
}