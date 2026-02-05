package Level1;
import java.util.*;
public class Eligiblity_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        Eligiblity(arr);
    }
    public static void Eligiblity(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.println("Invalid age");
            }
            else if(arr[i]>18){
                System.out.println("Student is Eligible fo voting");
            }
            else{
                System.out.println("Student is not eligible for voting");
            }
        }
    }
    
}
