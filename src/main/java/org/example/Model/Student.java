package org.example.Model;

public class Student {
    private String Name;
    private String email;
    private String StudentId;

    public Student(String Name, String email, String StudentId){
        this.Name=Name;
        this.email=email;
        this.StudentId=StudentId;
    }

    public String getName(){
        return Name;
    }
    public String getEmail(){
        return email;
    }
    public String getStudentId(){
        return StudentId;
    }
}
