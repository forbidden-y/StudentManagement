package org.example.entity;

/**
 * @author bay
 */
public class Teacher {
    private String teacherName;
    private String teacherId;
    private String age;
    private String gender;
    private String title;

    public Teacher() {
    }

    public Teacher(String teacherName, String teacherId, String age, String gender, String title) {
        this.teacherName = teacherName;
        this.teacherId = teacherId;
        this.age = age;
        this.gender = gender;
        this.title = title;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
