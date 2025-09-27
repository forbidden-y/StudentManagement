package org.example.service;

import org.example.entity.Student;
import org.example.exceptions.InvalidStudentDataException;
import org.example.exceptions.StudentNotFoundException;
import org.example.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * @author bay
 * 服务层,处理业务逻辑
 */
@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    /**
     * 获取全部学生信息
     *
     * @return List<Student>
     */
    @Override
    public List<Student> getAllStudent() {
        return studentMapper.getAll();
    }

    /**
     * 根据学号查询学生信息
     *
     * @return student
     */
    @Override
    public Student getStudentById(String studentId) {
        Student student = studentMapper.getById(studentId);
        if (student == null) {
            throw new StudentNotFoundException("未找到学号为 " + studentId + " 的学生");
        }
        return student;
    }

    /**
     * 根据学号添加学生信息
     *
     */
    @Override
    public Student addStudent(Student student) {
        // 验证学生数据
        validateStudentData(student);

        // 检查学生是否已存在
        if (isStudentExists(student.getStudentId())) {
            throw new IllegalArgumentException("学号为 " + student.getStudentId() + " 的学生已存在，无法添加");
        }

        studentMapper.add(student);
        return student;
    }


    @Override
    public String updateStudent(Student student) {
        if (!isStudentExists(student.getStudentId())) {
            throw new StudentNotFoundException("未找到学号为 " + student.getStudentId() + " 的学生，无法更新");
        }
        // 验证学生数据
        validateStudentData(student);

        studentMapper.update(student);
        return "更新成功";
    }

    @Override
    public String deleteStudent(String studentId) {
        if (!isStudentExists(studentId)) {
            throw new StudentNotFoundException("未找到学号为 " + studentId + " 的学生，无法删除");
        }
        studentMapper.deleteById(studentId);
        return "删除成功";
    }

    /**
     * 验证学生数据是否完整和有效
     */
    private void validateStudentData(Student student) {
        if (student.getStudentId() == null || student.getStudentId().isEmpty() ||
                student.getName() == null || student.getName().isEmpty() ||
                student.getBirthday() == null || student.getBirthday().isEmpty() ||
                student.getClassId() == null || student.getClassId().isEmpty() ||
                student.getGender() == null || student.getGender().isEmpty()) {
            throw new InvalidStudentDataException("所有字段均为必填项，且不能为空");
        }

        // 可以添加更多验证逻辑，如学号格式、生日格式等
        validateBirthday(student.getBirthday());
    }

    /**
     * 检查学生是否存在
     */
    private boolean isStudentExists(String studentId) {
        return studentMapper.getById(studentId) != null;
    }

    /**
     * 验证生日格式和合理性
     */
    private void validateBirthday(String birthday) {
        try {
            LocalDate date = LocalDate.parse(birthday);
            if (date.isAfter(LocalDate.now())) {
                throw new InvalidStudentDataException("生日不能晚于当前日期");
            }
        } catch (Exception e) {
            throw new InvalidStudentDataException("生日格式不正确，应为 YYYY-MM-DD 格式");
        }
    }
}
