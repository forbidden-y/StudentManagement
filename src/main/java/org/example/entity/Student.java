package org.example.entity;

import org.springframework.stereotype.Component;

/**
 * @author bay
 */
@Component
public class Student {
    private String studentId;
    private String name;
    private String birthday;
    private String classId;
    private String gender;
    private int grade;

    public Student() {
    }

    public Student(String studentId, String name, String birthday, String classId, String gender, int grade) {
        this.studentId = studentId;
        this.name = name;
        this.birthday = birthday;
        this.classId = classId;
        this.gender = gender;
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", classId='" + classId + '\'' +
                ",gender='";
    }
}
