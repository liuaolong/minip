package com.minip.back.mapper;

import com.minip.back.entity.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TeacherMapper {
    @Select("select * from teacher")
    List<Teacher> findAll();

    @Update("insert into teacher(id,name,intro,career,level,avatar,sort) " +
            "values (#{id},#{name},#{intro},#{career},#{level},#{avatar},#{sort}) ")
    Boolean insertTeacher(Teacher teacher);

    @Delete("delete from teacher where id = #{id}")
    Boolean removeById(Long id);
}
