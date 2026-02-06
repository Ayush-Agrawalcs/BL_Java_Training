package Level3;
import java.util.*;

public class Find_Factor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=factor(n);
        System.out.println("The factors are:");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        int Maxvalue=Factmax(arr);
        System.out.println("The largest factor is :"+Maxvalue);
        int Factorsum=Factsum(arr);
        System.out.println("The sum of factor is:"+Factorsum);
        int Fcatorproduct=Factproduct(arr);
        System.out.println("The product of all the factors is  "+Fcatorproduct);
        int Factorcube=FactCubeProduct(arr);
        System.out.println("The product of cube of array is  "+Factorcube);
    }
    public static int[] factor(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)c++;
        }
        int ans[]=new int[c];
        int k=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                ans[k]=i;
                k++;
            }
        }
        return ans;
    }
  public static int Factmax(int arr[]){
    int max=Integer.MIN_VALUE;
    for(int i:arr){
        max=Math.max(max,i);
    }
    return max;
  }
public static int Factsum(int arr[]){
    int sum=0;
    for(int i:arr){
        sum+=i;
    }
    return sum;
}
public static int Factproduct(int arr[]){
    int product=1;
    for(int i:arr){
        product*=i;
    }
    return product;
}
public static int FactCubeProduct(int arr[]){
    for(int i=0;i<arr.length;i++){
        double c=Math.pow(arr[i],3);
        arr[i]=(int)c;
    }
    int pro=1;
    for(int i:arr){
        pro*=i;
    }
    return pro;
}
    
}
