package com.minip.back.mapper;

import com.minip.back.entity.Edu_Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EduTeacherMapper {
    @Select("select * from edu_teacher")
    List<Edu_Teacher> findAll();
}
