package com.pets.video.dao;

import com.pets.video.data.entity.Bgm;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BgmMapper {
    int deleteByPrimaryKey(String id);

    int insert(Bgm record);

    int insertSelective(Bgm record);

    Bgm selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Bgm record);

    int updateByPrimaryKey(Bgm record);
}