package com.minip.back.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Course {
    private static final long serialVersionUID = 1L;

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getLessonNum() {
        return lessonNum;
    }

    public void setLessonNum(Integer lessonNum) {
        this.lessonNum = lessonNum;
    }

    public Float getDurationSum() {
        return durationSum;
    }

    public void setDurationSum(Float durationSum) {
        this.durationSum = durationSum;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Long getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Long buyCount) {
        this.buyCount = buyCount;
    }

    public Long getViewCount() {
        return viewCount;
    }

    public void setViewCount(Long viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    private Long teacherId;

    private Long subjectId;

    private Long subjectParentId;

    private String title;

    private BigDecimal price;

    private Integer lessonNum;

    private Float durationSum;

    private String cover;

    private Long buyCount;

    private Long viewCount;

    private Integer status;

    private Date publishTime;

}
