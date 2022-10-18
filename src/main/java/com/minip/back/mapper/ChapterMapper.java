package com.minip.back.mapper;

import com.minip.back.entity.Chapter;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ChapterMapper {

    @Select("select * from chapter")
    List<Chapter> findAll();

}
