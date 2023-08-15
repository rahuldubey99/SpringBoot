package com.springdemo.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.demo.services.CoursesService;

@RestController
public class MyController {

    @Autowired
    private CoursesService coursesService;

    @GetMapping("/home")
    public String getHome() {
        return "this is home page";
    }

    // Get Courses
    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.coursesService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        System.out.println("course"+courseId+"");
        return this.coursesService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/course")
    public Course addCourse(@RequestBody Course course) {
        return this.coursesService.addCourse(course);
    }

} 
