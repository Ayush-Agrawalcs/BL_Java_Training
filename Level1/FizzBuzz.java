package Level1;
import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n+1];
        for(int i=0;i<arr.length;i++){
            if(i%3==0){
                arr[i]="Fizz";
            }
            else if(i%5==0){
                arr[i]="Buzz";
            }
            else if(i%3==0 && i%5==0){
                arr[i]="FizzBuzz";
            }
            else{
                arr[i]=String.valueOf(i);
            }

        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
