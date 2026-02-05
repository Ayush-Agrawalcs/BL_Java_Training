package Level1;
import java.util.*;

public class Find_reminder_and_Quotien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rem=sc.nextInt();
        int qui=sc.nextInt();
        int arr[]=Find_rem_and_qui(rem,qui);
        System.out.println("The Reminder is "+arr[0]+" and quotient "+arr[1]);
        
    }
    public static int [] Find_rem_and_qui(int rem,int qui){
    int arr[]=new int[2];
    int remainder=rem/qui;
    int quotiend=rem%qui;
    arr[0]=remainder;
    arr[1]=quotiend;
    return arr;
    

    }
}
