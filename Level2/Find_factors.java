package Level2;
import java.util.*;

public class Find_factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int arr[]=calculate_factor(k);
        int sum=calculate_sum(arr);
        int squar=calculate_sum_of_square(arr);
        int product=calculate_product(arr);
        System.out.print("Fcators is: ");
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Calculate the sum of factor "+sum);
        System.out.println("Calculate the sum of square of factor "+squar);
        System.out.println("Calculate the product of factor "+product);

    }
    public static int calculate_sum(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
     public static int calculate_product(int []arr){
        int sum=1;
        for(int i=0;i<arr.length;i++){
            sum*=arr[i];
        }
        return sum;
    }
      public static int calculate_sum_of_square(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]*arr[i];
        }
        return sum;
    }
    public static int[] calculate_factor(int k){
        int c=0;
        for(int i=1;i<=k;i++){
            if(k%i==0){
                c++;
            }
        }
        int arr[]=new int[c];
        int l=0;
        for(int i=1;i<=k;i++){
            if(k%i==0){
                arr[l]=i;
                l++;
            }
        }
        return arr;
    }


    
}
