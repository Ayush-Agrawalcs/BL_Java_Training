package org.example.Service;

import java.util.*;

import org.example.Annotation.RegistrationRule;
import org.example.Exception.NoSeatAvilable;
import org.example.Model.Course;
import org.example.Model.CourseType;
import org.example.Model.Registration;
import org.example.Model.Student;
import org.example.Validation.Validation;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class RegistrationService {
    private List<Registration<?>>list=new ArrayList<>();
    private Set<String>set=new HashSet<>();
    private Queue<Student>waiting=new LinkedList<>();
    private Stack<Registration<?>>st=new Stack<>();
    private Map<CourseType, AtomicInteger>map=new HashMap<>();

    public RegistrationService(){
        map.put(CourseType.DATABASE,new AtomicInteger(1));
        map.put(CourseType.NETWORK,new AtomicInteger(1));
        map.put(CourseType.PROGRAMMING,new AtomicInteger(1));
    }
    Validation valid=new Validation();
    @RegistrationRule(requiredfields = {"email","studentId","CourseType"},allowWaitingList = true)
    public <T extends Course>Registration<T>addcourse(Student stu,T course) throws NoSeatAvilable {
        if(!valid.isValidateemail(stu.getEmail())){
            throw new IllegalArgumentException("Invalid email");
        }
        if(!valid.isvalidateStudentId(stu.getStudentId())){
            throw new IllegalArgumentException("Invalid StudentId");
        }
        if(set.contains(stu.getStudentId())){
            throw new IllegalArgumentException("Student is Already registered");
        }
        AtomicInteger at=map.get(course.getType());

        if(at.get()<=0){
            waiting.add(stu);
            throw new IllegalArgumentException("No seat Avilable");
        }
        at.decrementAndGet();
        Registration<T>regis=new Registration(stu,course);
        list.add(regis);
        st.add(regis);
        set.add(stu.getStudentId());
        System.out.println(stu.getStudentId() + " has Booked the course "+ regis.getCourse().getType());
        return regis;
    }

    public void undo(){
        if(!st.isEmpty()){
            Registration<?>regis=st.pop();
            CourseType course=regis.getCourse().getType();
            map.get(course).incrementAndGet();
            System.out.println("Student UNDO registration :"+regis.getStudent().getStudentId());
            set.remove(regis.getStudent().getStudentId());
            list.remove(regis);
        }
    }

    public List<CourseType> availableCourse(){
        return map.entrySet().stream().filter(e -> e.getValue().get() > 0)  .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

}
