package com.minip.back.controller;

import com.minip.back.mapper.TeacherMapper;
import com.minip.back.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TeacherController {

    @Resource
    TeacherMapper teacherMapper;

    @GetMapping("/teac")
    public Result getAllTeacher(){
        // Map<String,Object> map = new LinkedHashMap<>();
        return  Result.ok().data("item",teacherMapper.findAll());
    }


}
