package org.example.service;

import org.example.entity.Course;
import org.example.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bay
 */
@Service
public class CourseServiceImp {

    @Autowired
    private CourseMapper courseMapper;

    public List<Course> getAllCourses() {
        return courseMapper.getAll();
    }

    public Course getCourseById(String classId) {
        return courseMapper.getById(classId);
    }

    public Course addCourse(Course course) {
        courseMapper.add(course);
        return course;
    }

    public String updateCourse(Course course) {
        Course existingCourse = courseMapper.getById(course.getClassId());
        if (existingCourse == null) {
            throw new IllegalArgumentException("班级ID为 " + course.getClassId() + " 的课程不存在，无法更新");
        }
        courseMapper.update(course);
        return "更新成功";
    }

    public String deleteCourseById(String classId) {
        Course existingCourse = courseMapper.getById(classId);
        if (existingCourse == null) {
            throw new IllegalArgumentException("班级ID为 " + classId + " 的课程不存在，无法删除");
        }
        courseMapper.deleteById(classId);
        return "删除成功";
    }
}
