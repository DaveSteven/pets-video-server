package com.pets.video.dao;

import com.pets.video.data.entity.Videos;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VideosMapper {
    int deleteByPrimaryKey(String id);

    int insert(Videos record);

    int insertSelective(Videos record);

    Videos selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Videos record);

    int updateByPrimaryKey(Videos record);
}