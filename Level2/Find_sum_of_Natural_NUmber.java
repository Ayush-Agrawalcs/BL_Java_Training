package Level2;
import java.util.*;
public class Find_sum_of_Natural_NUmber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int recur=find_sum_using_recur(k,0);
        int form=find_sum_using_for(k);
        System.out.println(recur);
        if(recur==form){
            System.out.println("the Natural no. sum "+recur);
        }else{
            System.out.println("thsi is not a natural no.");
        }
    }
    public static int find_sum_using_recur(int k,int sum){
        if(k==0){
            return sum;
        }
        return find_sum_using_recur(k-1,sum+k);
    }
     public static int find_sum_using_for(int k){
        int n=k*(k+1)/2;
        return n;
    }

    
}
