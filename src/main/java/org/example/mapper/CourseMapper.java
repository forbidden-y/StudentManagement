package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.entity.Course;

import java.util.List;

/**
 * @author bay
 */
@Mapper
public interface CourseMapper {
    List<Course> getAll();
    Course getById(String classId);
    int add(Course course);
    int update(Course course);
    int deleteById(String classId);
}
