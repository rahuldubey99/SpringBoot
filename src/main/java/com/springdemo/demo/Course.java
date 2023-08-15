package com.springdemo.demo;

public class Course {
private long id;
private  String title;
private String description;

public Course(long id, String title, String description) {
    super();
    this.id = id;
    this.title = title;
    this.description = description;
}

public Course(){
    super();
}

public void setId(long id){
    this.id = id;
}
public long getId(){
    return id;
}
public void setDescription(String description){
    this.description = description;
}
public String getDescription(){
    return description;
}
public void setTitle(String title){
    this.title = title;
}
public String getTitle(){
    return title;
}
@Override
public String toString(){
    return "Course [" + "id=" + id +"title="+title + "description="+description + "]";
}
}
