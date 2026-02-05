package Level3;
import java.util.*;

 class Numbercheck{
    public static int countdigit(int digit){
        int count=0;
        while(digit>0){
            count++;
            digit/=10;
        }
        return count;
    }

    public static int[] storedigit(int count,int digit){
        int arr[]=new int[count];
        int j=count-1;
        while(digit>0){
            int rem=digit%10;
            arr[j]=rem;
            j--;
            digit/=10;
        }
        return arr;
    }

    public static boolean armstorng(int digit,int count){
        int temp=digit;
        int dig[]=new int[count];

        for(int i=count-1;i>=0;i--){
             dig[i] = temp % 10;
             temp /= 10;
        }

        int sum=0;
        for(int i=0;i<dig.length;i++){
             sum += Math.pow(dig[i], count);
        }

        return sum==digit;
    }

    public static void useMin(int []arr){
        int min=Integer.MIN_VALUE;
        int min1=Integer.MIN_VALUE;
        for(int j=0;j<arr.length;j++){
            if(min<arr[j]){
                 min1=min;
                min=arr[j];
               
            }
            else if(min1<arr[j] && min1<min){
                min1=arr[j];
            }
        }
         System.out.println("First largest: "+min);
        System.out.println("Second largest: "+min1);
    }

        public static void useMax(int []arr){
        int min=Integer.MAX_VALUE;
        int min1=Integer.MAX_VALUE;
        for(int j=0;j<arr.length;j++){
            if(min>arr[j]){
                min1=min;
                min=arr[j];
                
            }
            if(min1>arr[j] && arr[j]!=min){
                min1=arr[j];
            }
        }
        System.out.println("First smallest: "+min);
        System.out.println("Second smallest: "+min1);
    }

}

public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int count=Numbercheck.countdigit(k);
        int arr[]=Numbercheck.storedigit(count,k);
        boolean arm=Numbercheck.armstorng(k,count);
        System.out.println("Count the dgit: "+count);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println(arm+" is a armstrong");
         Numbercheck.useMax(arr);
        Numbercheck.useMin(arr);


    }
    
}
