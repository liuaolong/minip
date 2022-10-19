package com.minip.back.controller;


import com.minip.back.service.CourseService;
import com.minip.back.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/findall")
    public Result findAllCourse(){
            return Result.ok().data("Course",courseService.findall());

    }
}
