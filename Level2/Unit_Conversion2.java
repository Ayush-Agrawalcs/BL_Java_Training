package Level2;
import java.util.*;
public class Unit_Conversion2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double yard2feet=convertyardtofeet(n);
        double feet2yard=convertfeettoyard(n);
        double meter2inches=convertmetertoinches(n);
        double inches2meter=convertinchestometer(n);
        double Inches2Centimeter=convertInchestoCentimeter(n);
        System.out.println(n+" yard in feed is: "+yard2feet);
        System.out.println(n+" feet in yards is: "+feet2yard);
        System.out.println(n+" meter in inches: "+ meter2inches);
        System.out.println(n+" inches in meter is: "+ inches2meter);
        System.out.println(n+" inches in centimeter is: "+ Inches2Centimeter);
    }   
    public static double convertyardtofeet(int n){
        double res=n*3;
        return res;
    }
    public static double convertfeettoyard(int n){
        double res=n*0.333333;
        return res;
    }
    public static double convertmetertoinches(int n){
        double res=n*39.3701;
        
        return res;
    }
    public static double convertinchestometer(int n){
        double res=n*0.0254;
        
        return res;
    }
    public static double convertInchestoCentimeter(int n){
        double res=n*2.54;
        return res;
    }
    
}
