package org.example.Model;

public class Registration<T extends Course>{
    private Student student;
    private T course;

    public Registration(Student st, T Course){
        this.student=st;
        this.course=Course;
    }

    public Student getStudent(){
        return student;
    }

    public T getCourse(){
        return course;
    }

}
