package org.example.entity;

import org.springframework.stereotype.Component;

/**
 * @author bay
 */
@Component
public class Course {
    private String courseId;
    private String courseName;
    private String teacherId;
    private String teacherName;
    /**
     * 课程学时
     */
    private double courseHour;
    /**
     * 课程学分
     */
    private double credit;


    public Course() {
    }

    public Course(String classId, String className, String teacherId, String teacherName, double courseHour, double credit) {
        this.courseId = classId;
        this.courseName = className;
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.courseHour = courseHour;
        this.credit = credit;
    }

    public String getClassId() {
        return courseId;
    }

    public void setClassId(String classId) {
        this.courseId = classId;
    }

    public String getClassName() {
        return courseName;
    }

    public void setClassName(String className) {
        this.courseName = className;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public double getClassHour() {
        return courseHour;
    }

    public void setClassHour(double classHour) {
        this.courseHour = classHour;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
