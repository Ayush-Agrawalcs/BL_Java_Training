package Level2;
import java.util.*;
public class Quardratic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        double arr[]=quardraticequation(a,b,c);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static double[] quardraticequation(int a,int b,int c){
        double delta=Math.pow(b,2)+ 4*a*c;
        if(delta>0){
            double arr[]=new double[2];
            arr[0]=(-b+Math.sqrt(delta))/(2*a);
            arr[1]=(-b-Math.sqrt(delta))/(2*a);
            return arr;
        }
        else{
            double arr[]=new double[1];
            return arr;
        }

    }
    
}
