package com.minip.back.controller;

import com.minip.back.mapper.ChapterMapper;
import com.minip.back.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chapter")
public class ChapterController {

    @Autowired
    ChapterMapper chapterMapper;

    @GetMapping("/find")
    public Result findAll(){
        return Result.ok().data("look",chapterMapper.findAll());
    }

}
