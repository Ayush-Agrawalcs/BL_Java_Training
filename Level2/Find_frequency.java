package Level2;
import java.util.*;

public class Find_frequency {
    public static void main(String[] args) {  
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    int l=n;
     while(l>0){
        count++;
        l/=10;
    }
    int arr[]=new int[count];
    int j=count-1;
    l=n;
    while(l>0){
        int rem=l%10;
        arr[j]=rem;
        j--;
        l/=10;
    }
    int freq[]=new int[10];
    for(int i=0;i<arr.length;i++){
        int k=arr[i];
        freq[k]+=1;
    }
    for(int i=0;i<freq.length;i++){
        System.out.println(i+"-->"+freq[i]);
    }
    }
}
