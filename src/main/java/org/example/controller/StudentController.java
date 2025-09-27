package org.example.controller;

import org.example.entity.Student;
import org.example.service.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author bay
 */
@RestController
@RequestMapping("/api/Student")
public class StudentController {

    @Autowired
    private StudentServiceImp studentServiceImp;

    /**
     * 获取全部学生信息
     * URL: GET /api/Student
     */
    @GetMapping
    public Result<List<Student>> getAllStudent() {
        try {
            List<Student> students = studentServiceImp.getAllStudent();
            return Result.success(students);
        } catch (Exception e) {
            return Result.error("获取学生列表失败: " + e.getMessage());
        }
    }

    /**
     * 根据学号获取学生信息
     * URL: GET /api/Student/{studentId}
     */
    @GetMapping("/{studentId}")
    public Result<Student> getStudentById(@PathVariable String studentId) {
        try {
            Student student = studentServiceImp.getStudentById(studentId);
            return Result.success(student);
        } catch (Exception e) {
            return Result.error("查询学生信息失败: " + e.getMessage());
        }
    }

    /**
     * 添加学生信息
     * URL: PUT /api/Student/{studentId}
     */
    @PostMapping
    public Result<Student> addStudent(@RequestBody Student student) {
        try {
            Student addedStudent = studentServiceImp.addStudent(student);
            return Result.success("添加学生成功", addedStudent);
        } catch (Exception e) {
            return Result.error("添加学生失败: " + e.getMessage());
        }
    }

    /**
     * 更新学生信息
     * URL: PUT /api/Student/{studentId}
     */
    @PutMapping("/{studentId}")
    public Result<String> updateStudent(@RequestBody Student student) {
        try {
            String result = studentServiceImp.updateStudent(student);
            return Result.success(result);
        } catch (Exception e) {
            return Result.error("更新学生信息失败: " + e.getMessage());
        }
    }

    /**
     * 删除学生信息
     * URL: DELETE /api/Student/{studentId}
     */
    @DeleteMapping("/{studentId}")
    public Result<String> deleteStudent(@PathVariable String studentId) {
        try {
            String result = studentServiceImp.deleteStudent(studentId);
            return Result.success("删除学生成功", result);
        } catch (Exception e) {
            return Result.error("删除学生失败: " + e.getMessage());
        }
    }
}
