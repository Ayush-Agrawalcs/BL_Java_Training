package Level2;
import java.util.*;
public class reverse_arryay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int count=0;
        int l=k;
        while(l>0){
            int rem=l%10;
            count++;
            l/=10;
        }
        int arr[]=new int[count];
        int reverse[]=new int[count];
        l=k;
        int j=count-1;
        while(l>0){
            int rem=l%10;
            arr[j]=rem;
            j--;
            l/=10;
        }
        int o=0;
        for(int i=arr.length-1;i>=0;i--){
            reverse[o]=arr[i];
            o++;
        }

        for(int i=0;i<reverse.length;i++){
            System.out.print(reverse[i]);
        }
    }
    
}
