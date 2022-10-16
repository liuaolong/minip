package com.minip.back.mapper;

import com.minip.back.entity.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    @Select("select * from edu_teacher")
    List<Teacher> findAll();
}
