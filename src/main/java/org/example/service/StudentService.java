package org.example.service;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.example.entity.Student;

import java.util.List;

/**
 * @author bay
 */
public interface StudentService {
    /**
     *获取全部学生信息
     */
    @Select("select * from students")
    List<Student> getAllStudent();
    /**
     * 根据学号获取学生信息
     */
    @Select("select * from students where studentId = #{Id}")
    Student getStudentById(String studentId);

    /**
     * 添加学生信息
     */
    @Insert("insert into students values (#{student.studentId}, #{student.name},#{student.birthday} #{student.classId}, #{student.gender})")
    Student addStudent(Student student);
    /**
     * 更新学生名字,生日,班级,性别
     */
    @Update("update students set name = #{student.name}, birthday = #{student.birthday}, classId = #{student.classId}, gender = #{student.gender}")
    String updateStudent(Student student);

    /**
     * 根据学号删除学生信息
     */
    @Delete("delete from students where studentId = #{studentId}")
    String deleteStudent(String studentId);
}
