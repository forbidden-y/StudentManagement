package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.entity.Student;

import java.util.List;

/**
 * @author bay
 * mybatis持久层,操作数据库
 */
@Mapper
public interface StudentMapper {
    /**
     * 获取全部学生信息
     * @return 学生实体列表
     */
    List<Student> getAll();

    /**
     * 根据学号获取学生信息
     * @param studentId 学号
     * return Student 学生实体
     */
    Student getById(String studentId);

    /**
     * 添加学生信息
     * @param student 学生实体
     * return int 影响的行数
     */
    int add(Student student);

    /**
     * 更新学生名字,生日,班级,性别
     * @param student 学生实体
     * return int 影响的行数
     */
    int update(Student student);

    /**
     * 根据学号删除学生信息
     * @param studentId 学号
     * return int 影响的行数
     */
    int deleteById(String studentId);
}
