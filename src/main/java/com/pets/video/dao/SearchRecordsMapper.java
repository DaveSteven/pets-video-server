package com.pets.video.dao;

import com.pets.video.data.entity.SearchRecords;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SearchRecordsMapper {
    int deleteByPrimaryKey(String id);

    int insert(SearchRecords record);

    int insertSelective(SearchRecords record);

    SearchRecords selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SearchRecords record);

    int updateByPrimaryKey(SearchRecords record);
}