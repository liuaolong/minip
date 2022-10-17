package com.minip.back.controller;


import com.minip.back.service.FileService;
import com.minip.back.service.impl.FileServiceImpl;
import com.minip.back.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/file")
public class FileUploadController {

    @Autowired
    private FileService fileService;

    @PostMapping("/upload")
    public Result uploadFile(@RequestParam("file")MultipartFile file) {
        System.out.println("Create a new bucket for demo1\n");
        String url = fileService.upload(file);
        return Result.ok().data("上传文件成功",url);
    }

}
