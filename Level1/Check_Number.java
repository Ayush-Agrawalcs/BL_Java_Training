package Level1;
import java.util.*;
public class Check_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=check_number(n);
        if(ans==1){
            System.err.println("The number is positive");
        }
        else if(ans==-1){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is Zero");
        }
    }
    public static int  check_number(int n){
        if(n>0){
            return 1;
        }
        else if(n<0){
            return -1;
        }
        else{
            return 0;
        }
    }
    
}
