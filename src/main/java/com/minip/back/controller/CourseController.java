package com.minip.back.controller;


import com.minip.back.entity.Course;
import com.minip.back.entity.vo.PageVo;
import com.minip.back.mapper.CourseMapper;
import com.minip.back.service.CourseService;
import com.minip.back.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @Autowired
    CourseMapper courseMapper;

    @GetMapping("/findall")
    public Result findAllCourse(){
            return Result.ok().data("Course",courseService.findall());

    }

    //根据课程分类查询课程列表（分页）
    @GetMapping("/page")
    public Result findByPage(@RequestParam(defaultValue = "1")Integer pageNum ,
                             @RequestParam(defaultValue = "10")Integer pageSize) {

        Integer offset = (pageNum - 1) *pageSize;
        List<Course> courseData = courseMapper.findByPage(offset,pageSize);
        PageVo<Course> page = new PageVo<>();
        page.setData(courseData);

        Integer total = courseMapper.countCourse();
        page.setTotal(total);
        page.setPageNum(pageNum);
        page.setPageSize(pageSize);

        return Result.ok().data("good morning",page);
        }
}
