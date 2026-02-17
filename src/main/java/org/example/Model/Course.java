package org.example.Model;

public class Course {
    private String CourseName;
    private String CourseId;
    private CourseType type;

    public Course(String CourseName, String CourseId, CourseType type){
        this.CourseName=CourseName;
        this.CourseId=CourseId;
        this.type=type;
    }

    public String getCourseName(){
        return CourseName;
    }

    public String CourseId(){
        return CourseId;
    }

    public CourseType getType(){
        return type;
    }
}
