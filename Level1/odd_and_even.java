package Level1;
import java.util.*;
public class odd_and_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("This no. is not a natural no.");
        }
        else{
            int size=0;
            if(n%2!=0){
            size=n/2+1;
            }
            else{
                size=n/2;
            }
            int odd[]=new int[size];
            int even[]=new int[size];
            int k=0;
            int m=0;
            for(int i=1;i<=n;i++){
                if(i%2==0){
                    even[m]=i;
                    m++;
                }
                else{
                    odd[k]=i;
                    k++;
                }
            }

            System.out.println("Even array of natural no.");
            for(int i=0;i<even.length;i++){
                System.out.println(even[i]);
            }
            System.out.println("odd array of natural no.");
            for(int i=0;i<odd.length;i++){
                System.out.println(odd[i]);
            }
        }
    }
}
