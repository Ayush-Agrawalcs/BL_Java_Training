package Level2;
import java.util.*;

public class Check_positive_and_negative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<5;i++){
            if(isPositive(arr[i])){
                if(iseven(arr[i])){
                    System.out.println(arr[i]+" is a positive and even no.");
                }
                else{
                    System.out.println(arr[i]+" is a positive no. and odd no.");
                }
            }
            else{
                System.out.println(arr[i] +" is a negative no. ");
            }
        }

        compareto(arr[0],arr[arr.length-1]);
        
    }
    public static boolean isPositive(int i){
        if(i>0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean iseven(int i){
        if(i%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void compareto(int i,int j){
        if(i>j){
            System.out.println("First no. is greater then the last no.");
        }
        else if(i<j){
            System.out.println("First no. is less then the last no.");
        }
        else{
            System.out.println("Both no. are equal");
        }
    }
}
