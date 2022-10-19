package com.minip.back.entity.vo;

public class CourseQueryVo {

    private Long teacherId;


    private Long subjectId;


    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public Long getSubjectParentId() {
        return subjectParentId;
    }

    public void setSubjectParentId(Long subjectParentId) {
        this.subjectParentId = subjectParentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private Long subjectParentId;


    private String title;


}
