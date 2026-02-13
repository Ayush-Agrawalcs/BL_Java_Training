package org.example.Services;
//
import org.example.services.calculator;
import org.junit.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//
//import java.util.Date;
//
//public class calculatorTest {
//
//    int counter=0;
//    @BeforeClass
//    public static void init(){
//        System.out.println("Before all test cases");
//        System.out.println(new Date());
//        // connection open
//
//    }
//
//    @Before
//    public void Beforeeach(){
//        counter=0;
//    }
//    //test method add two no.
//    @Test
//    public void addtwonoTest() {
//        for(int i=1;i<=20;i++){
//            counter+=i;
//        }
//        System.out.println("firsttestcase");
//        int res = calculator.addtwono(12, 14);
//        System.out.println("counter in first test case: " +counter);
//        Assert.assertEquals(res, 26);
//    }
//
//    @Test(timeout=2000)
//    public void sumnNumber(){
//        for(int i=1;i<=20;i++){
//            counter+=i;
//        }
//        System.out.println("secondtestcase");
//        int res=calculator.sumnNumbers(5,4,3,2,1);
//        System.out.println("counter in second test case: " +counter);
//        Assert.assertEquals(res,15);
//    }
//
//    @After
//    public void AfterEach(){
//        System.out.println("et");
//    }
//
//    @AfterClass
//    public static void cleanup(){
//        System.out.println("clean up");
//        System.out.println(new Date());
//    }
//}

public  class calculatorTest {

    @Test
    public void addtwonoTest(){
       int res= calculator.addtwono(4,5);
int excpected=10;
        Assertions.assertEquals(res,excpected,"Test failed");
    }

    @Test
    public void sumnNumberTest(){

    }


}
