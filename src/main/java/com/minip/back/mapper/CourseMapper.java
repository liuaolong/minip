package com.minip.back.mapper;

import com.minip.back.entity.Course;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CourseMapper {

    //查询所有课程
    @Select("select * from course")
    List<Course> findlist();
}
