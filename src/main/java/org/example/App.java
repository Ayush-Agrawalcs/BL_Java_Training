package org.example;

import org.example.Exception.NoSeatAvilable;
import org.example.Model.Course;
import org.example.Model.CourseType;
import org.example.Model.Student;
import org.example.Service.RegistrationService;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        while (true) {
            Scanner sc=new Scanner(System.in);
            RegistrationService r=new RegistrationService();
            System.out.println("Fill the Student Detail");
            System.out.print("Fill the Student Name: ");
            String name=sc.next();
            System.out.print("Fill the Student email: ");
            String email=sc.next();
            System.out.print("Fill the Student Id: ");
            String id=sc.next();
            Student s1=new Student(name,email,id);
            System.out.println("Fill the Course Details");
            System.out.print("Fill the CourseName :");
            String courseName=sc.next();
            System.out.print("Fill the CourseId :");
            String courseID=sc.next();
            System.out.print("Fill teh courdeType in the three option like 1-programming,2-DATABASE,3-Network :");
            String type=sc.next();
            Course c1=new Course(courseName,courseID, CourseType.PROGRAMMING);;
            switch(type){
                case "1":
                c1=new Course(courseName,courseID, CourseType.PROGRAMMING);
                break;
                case "2":
                    c1=new Course(courseName,courseID, CourseType.DATABASE);
                    break;
                case "3":
                    c1=new Course(courseName,courseID, CourseType.NETWORK);
                    break;
            }
            try{
                r.addcourse(s1,c1);
            } catch (NoSeatAvilable e) {
                throw new RuntimeException(e);
            }
            System.out.println(r.availableCourse());

            String st=sc.next();
            if(st.equals("exit")){
                break;
            }
        }
    }
}
