package com.minip.back.entity.vo;

public class CourseProgressVo {


    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Float getDurationSum() {
        return durationSum;
    }

    public void setDurationSum(Float durationSum) {
        this.durationSum = durationSum;
    }

    public Float getProgressSum() {
        return progressSum;
    }

    public void setProgressSum(Float progressSum) {
        this.progressSum = progressSum;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    private Long courseId;

    private Long userId;

    private Float durationSum;

    private Float progressSum;

    private Integer progress;

}
