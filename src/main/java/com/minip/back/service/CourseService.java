package com.minip.back.service;

import com.minip.back.entity.Course;
import com.minip.back.entity.vo.CourseQueryVo;
import com.minip.back.entity.vo.PageVo;

import java.util.List;
import java.util.Map;

public interface CourseService {
    //查询所有课程
    List<Course> findall();


    List<Course> findByPage( Integer offset , Integer PageSize);
    //List<Course> findByPage();
    //Map<String ,Object> findPage(PageVo<Course> pageParam, CourseQueryVo courseQueryVo);
}
