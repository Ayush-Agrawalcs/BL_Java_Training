package Level1;
import java.util.*;
public class Simple_Intrest{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int principal=sc.nextInt();
    int rate=sc.nextInt();
    int time=sc.nextInt();
    double ans=Calculate_Interest(principal,rate,time);
    System.out.println("The Simple Interest is "+ans+" for principal "+principal+" Rate of Interest "+rate+" and Time "+time);
}
public static double Calculate_Interest(int principal,int rate,int time){
    double si=(principal*rate*time);
    return si;
}
}