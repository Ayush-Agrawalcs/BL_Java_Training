package Level2;
import java.util.*;

public class Unit_Conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        double km2miles=convertkmtomiles(k);
        double feet2yards=convertfeettoyards(k);
        double inches2meter=convertinchestometer(k);
        double feet2meter=convertfeettometer(k);
        System.out.println(k+" km to miles= "+km2miles);
        System.out.println(k+" feet to yard= "+feet2yards);
        System.out.println(k+" inches to meter= "+inches2meter);
        System.out.println(k+" Feet to meter= "+feet2meter);
    }
    public static double convertkmtomiles(int k){
        double p=0.621371*(double)(k);
        return p;
    }
    public static double convertfeettoyards(int k){
        double p=1.60934*(double)(k);
        return p;
    }
    public static double convertinchestometer(int k){
        double p=3.28084*(double)(k);
        return p;
    }
    public static double convertfeettometer(int k){
        double p=0.3048*(double)(k);
        return p;
    }
}