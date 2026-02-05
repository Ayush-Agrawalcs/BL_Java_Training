package Level1;
import java.util.*;

public class Natural_Number_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=calculate_Natural_NUmber_sum(n);
        System.out.print("the sum of "+n+" natural no. is "+sum);
    }
    public static int calculate_Natural_NUmber_sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    
}
