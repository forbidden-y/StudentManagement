package org.example.controller;

import org.example.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bay
 */
@RestController
@RequestMapping("/api/Course")
public class CourseController {

    @Autowired
    private Course course;

    @GetMapping
    public Course getCourse() {
    }

    @PostMapping
    public Course addCourse() {
    }


}
