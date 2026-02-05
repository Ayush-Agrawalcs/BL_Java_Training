package Level2;
import java.util.*;

class StudentVoteChecker{
    public boolean canStudentVote(int age){
        if(age<0){
            return false;
        }
        if(age>=18){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Eligiblity_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }

        StudentVoteChecker ss=new StudentVoteChecker();
        for(int i=0;i<arr.length;i++){
            if(ss.canStudentVote(arr[i])){
                System.out.println("The student age is "+arr[i] +" and he is eligible to vote");
            }
            else{
                System.out.println("The student age is "+arr[i] +" and he is not eligible to vote");
            }
        }

    }
    
}
