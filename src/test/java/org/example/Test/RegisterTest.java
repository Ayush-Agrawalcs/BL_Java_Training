package org.example.Test;

import org.example.Exception.NoSeatAvilable;
import org.example.Model.Course;
import org.example.Model.CourseType;
import org.example.Model.Student;
import org.example.Service.RegistrationService;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class RegisterTest {
    @Test
    public void testRegistrationSuccess() throws Exception {
        RegistrationService service = new RegistrationService();
        Student s = new Student("Ayuhs", "a@test.com", "STU123");
        Course c = new Course("DBMS", "C1" ,CourseType.PROGRAMMING);

        assertNotNull(service.addcourse(s, c));
    }

    @Test
    public void testNoSeatAvailable() throws Exception {
        RegistrationService service = new RegistrationService();
        Course c = new Course("CN","c2" , CourseType.PROGRAMMING);

        service.addcourse(new Student("Ayush", "A@test.com", "STU202"), c);
        service.addcourse(new Student("Aman", "B@test.com", "STU203"), c);


    }
    
}
