package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface HiveMapper {

    @Select("select s1,s2,s3,s4 from hive_test")
    List<Map<String,Object>> queryHive();
}
