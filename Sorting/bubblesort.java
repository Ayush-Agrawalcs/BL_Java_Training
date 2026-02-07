package Sorting;
import java.util.*;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int arr[]=new int[k];

        for(int i=0;i<k;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<k-1;i++){
            for(int j=0;j<k-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
}
