package Sorting;
import java.util.*;

public class mergesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int arr[]=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=sc.nextInt();
        }
        merge(arr,0,arr.length-1);
        
        for(int i=0;i<arr.length;i++){
        
            System.out.println(arr[i]+" ");
        }
    }
    public static void merge(int arr[],int start,int end){
        if(start<end){
            int mid=(start+end)/2;
            merge(arr,start,mid);
           merge(arr,mid+1,end);
            print(arr,start,mid,end);
        }
    }
    public static void print(int []arr,int s,int m,int e){
        int l=s;
        int j=m+1;
        int k=0;
        int arr1[]=new int[e-s+1];
        while(l<=m && j<=e){
            if(arr[l]<=arr[j]){
                arr1[k]=arr[l];
                l++;
                k++;
            }
            else{
                arr1[k]=arr[j];
                k++;
                j++;
            }
        }

        while(j<=e){
            arr1[k]=arr[j];
            j++;
            k++;
        }

         while(l<=m){
            arr1[k]=arr[l];
            l++;
            k++;
        }

        for(int i = 0; i < arr1.length; i++){
    arr[s + i] = arr1[i];
}

    }
}
