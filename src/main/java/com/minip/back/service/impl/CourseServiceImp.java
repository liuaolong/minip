package com.minip.back.service.impl;

import com.minip.back.entity.Course;
import com.minip.back.entity.vo.CourseQueryVo;
import com.minip.back.entity.vo.PageVo;
import com.minip.back.mapper.CourseMapper;
import com.minip.back.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class CourseServiceImp implements CourseService {

    @Autowired
    CourseMapper courseMapper;

    //查询所有课程
    public List<Course> findall() {
        List<Course> list = courseMapper.findlist();
        return list;
    }

    @Override
     public List<Course> findByPage( Integer offset , Integer PageSize){
        return  null;
    };

//    //根据课程分类查询课程列表（分页）
//    @Override
//    public PageVo<Course> findByPage(@RequestParam(defaultValue = "1") Integer pageNum ,
//                                    @RequestParam(defaultValue = "10") Integer pageSize) {
//
//        Integer offset = (pageNum - 1) *10;
//        List<Course> courseData = courseMapper.findByPage(offset,pageSize);
//        PageVo<Course> page = new PageVo<>();
//        page.setData(courseData);
//
//        Integer total = courseMapper.countCourse();
//        page.setTotal(total);
//        page.setPageNum(pageNum);
//        page.setPageSize(pageSize);
//
//        return page;






//        //获取条件值
//        String title = courseQueryVo.getTitle();//课程名称
//        Long subjectId = courseQueryVo.getSubjectId();//二级分类
//        Long subjectParentId = courseQueryVo.getSubjectParentId();//一级分类
//        Long teacherId = courseQueryVo.getTeacherId();//讲师
//
//        //判断条件值是否为空，封装
//        QueryWrapper<Course> wrapper = new QueryWrapper<>();
//        if(!StringUtils.isEmpty(title)) {
//            wrapper.like("title",title);
//        }
//        if(!StringUtils.isEmpty(subjectId)) {
//            wrapper.eq("subject_id",subjectId);
//        }
//        if(!StringUtils.isEmpty(subjectParentId)) {
//            wrapper.eq("subject_parent_id",subjectParentId);
//        }
//        if(!StringUtils.isEmpty(teacherId)) {
//            wrapper.eq("teacher_id",teacherId);
//        }
//        //调用方法进行条件分页查询
//        PageVo<Course> pages = baseMapper.selectPage(pageParam, wrapper);
//
//        //获取分页数据
//        long totalCount = pages.getTotal();//总记录数
//        long totalPage = pages.getPages();//总页数
//        long currentPage = pages.getCurrent();//当前页
//        long size = pages.getSize();//每页记录数
//        //每页数据集合
//        List<Course> records = pages.getRecords();
//
//        //封装其他数据（获取讲师名称 和 课程分类名称）
//        records.stream().forEach(item -> {
//            this.getTeacherAndSubjectName(item);
//        });
//
//        //map集合返回
//        Map<String,Object> map = new HashMap<>();
//        map.put("totalCount",totalCount);
//        map.put("totalPage",totalPage);
//        map.put("records",records);
//        return map;


}
