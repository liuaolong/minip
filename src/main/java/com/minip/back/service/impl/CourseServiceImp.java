package com.minip.back.service.impl;

import com.minip.back.entity.Course;
import com.minip.back.mapper.CourseMapper;
import com.minip.back.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseServiceImp implements CourseService {

    @Autowired
    CourseMapper courseMapper;

    //查询所有课程
    public List<Course> findall() {
        List<Course> list = courseMapper.findlist();
        return list;
    }

}
