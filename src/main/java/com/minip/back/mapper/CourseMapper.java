package com.minip.back.mapper;

import com.minip.back.entity.Course;
import com.minip.back.entity.vo.CourseQueryVo;
import com.minip.back.entity.vo.PageVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface CourseMapper {

    //查询所有课程
    @Select("select * from course")
    List<Course> findlist();

    @Select("select * from course limit #{param1},#{param2}")
    List<Course> findByPage( Integer offset , Integer PageSize);
    //Map<String ,Object> findPage(PageVo<Course> pageParam, CourseQueryVo courseQueryVo);

    @Select("Select count(id) from course")
    Integer countCourse();
}
