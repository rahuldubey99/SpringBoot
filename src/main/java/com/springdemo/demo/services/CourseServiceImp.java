package com.springdemo.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springdemo.demo.Course;

@Service
public class CourseServiceImp implements CoursesService{

    List <Course> list;
    public CourseServiceImp() {
        list  = new ArrayList<>();   
        list.add(new Course(1,"java", "core java"));
        list.add(new Course(2,"python", "python3.8"));
        list.add(new Course(3,"C++", "C++"));

    }
    @Override
    public List<Course> getCourses(){
        return list;
    }

    @Override
    public Course getCourse(long id){
        Course c = null;
        for(Course course : list){
            if (course.getId() == id){ 
               c=course;
               break; 
            }
        }
        return c;
    }
    
    @Override 
    public Course addCourse(Course course){
        list.add(course);
        return course;
    }
}
