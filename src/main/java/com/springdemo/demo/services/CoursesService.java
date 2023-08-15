package com.springdemo.demo.services;

import java.util.List;

import com.springdemo.demo.Course;

public interface CoursesService {
    public List<Course> getCourses();

    public Course getCourse(long id);

    public Course addCourse(Course course);
}
