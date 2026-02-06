package Level3;

import java.util.Scanner;

public class NumberChecker4 {

      public static boolean isPrime(int digit) {
      int count=0;
      boolean flag=false;
      for(int i=2;i<=digit;i++){
        if(digit%i==0){
            count++;
        }
      }
      if(count==1){
        return true;
      }
      else{
        return false;
      }
    }

    public static boolean neon(int digit) {
        int k=(int)(Math.pow(digit,2));
        int l=k;
        int sum=0;
        while(l<0){
            int rem=l%10;
            sum+=l;
            l/=10;
        }
        if(sum==digit){
            return true;
        }
        else{
            return false;
        }

    }

    public static boolean spy(int digit) {
       int k=digit;
       int sum=0;
       int product=1;
       while(k>0){
        int rem=k%10;
        product*=rem;
        sum+=rem;
        k/=10;
       }
       if(product==sum){
        return true;
       }
       else{
        return false;
       }

    }


public static boolean automorphic(int digit){
    int l=(int)(Math.pow(digit,2));
    int k=l%10;
    if(digit==k){
        return true;
    }
    else{
        return false;
    }
}
    
    public static boolean buzz(int digit) {
       int k=digit;
       int sum=0;
       while(k>0){
        int rem=k%10;
        if(rem==7){
            return true;
        }
        break;
       }
       int l=digit;
       while(l>0){
        int rem=l%10;
        sum=sum*10+rem;
        if(sum%7==0){
            return true;
        }
        l/=10;
       }
       return false;
       
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(isPrime(k)+" is a prime No.");
        System.out.println(neon(k)+" is a neon no.");
        System.out.println(spy(k)+" is a spy no.");
        System.out.println(automorphic(k)+" is a automorphic no.");
        System.out.println(buzz(k)+" is a buzz no.");

        
    }
    
}
