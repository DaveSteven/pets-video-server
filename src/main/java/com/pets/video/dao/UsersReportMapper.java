package com.pets.video.dao;

import com.pets.video.data.entity.UsersReport;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersReportMapper {
    int deleteByPrimaryKey(String id);

    int insert(UsersReport record);

    int insertSelective(UsersReport record);

    UsersReport selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UsersReport record);

    int updateByPrimaryKey(UsersReport record);
}