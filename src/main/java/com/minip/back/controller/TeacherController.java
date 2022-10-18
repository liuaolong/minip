package com.minip.back.controller;

import com.minip.back.entity.Teacher;
import com.minip.back.mapper.EduTeacherMapper;
import com.minip.back.mapper.TeacherMapper;
import com.minip.back.service.TeacherService;
import com.minip.back.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/te")
public class TeacherController {

    @Resource
    EduTeacherMapper eduteacherMapper;

    @Autowired
    TeacherMapper teacherMapper;

    @GetMapping("/teac")
    public Result getAllTeacher(){
        // Map<String,Object> map = new LinkedHashMap<>();
        return  Result.ok().data("item",eduteacherMapper.findAll());
    }

    @GetMapping("/findAll")
    public Result findAllTeacher(){
        return Result.ok().data("look",teacherMapper.findAll());

    }

    @PostMapping("addTeacher")
    public Result addteacher(@RequestBody Teacher teacher){
        boolean isSuccess = teacherMapper.insertTeacher(teacher);
        if(isSuccess) {
            return Result.ok();
        } else {
            return Result.error();
        }
    }

    @DeleteMapping("/{id}")
    public Result deleteUser(@PathVariable("id") Long id){
        boolean isSuccess = teacherMapper.removeById(id);
        if(isSuccess) {
            return Result.ok();
        } else {
            return Result.error();
        }
    }


}
