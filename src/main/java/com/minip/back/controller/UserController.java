package com.minip.back.controller;

import com.minip.back.entity.User;
import com.minip.back.mapper.Usermapper;
import com.minip.back.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Resource
    Usermapper usermapper;

    @GetMapping("/user")
    public Result getAllUser(){
       // Map<String,Object> map = new LinkedHashMap<>();
        return  Result.ok().data("item",usermapper.findAll());
    }

}
