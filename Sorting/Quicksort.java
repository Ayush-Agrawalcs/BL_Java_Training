package Sorting;

public class Quicksort {

    public static void quick(int[] arr,int s,int e){
        if(s<e){
            int pivt=partion(arr,s,e);
            quick(arr, s, pivt-1);
            quick(arr, pivt+1, e);
        }
    }

    public static int partion(int arr[],int s,int e){
        int ind=-1;
        for(int i=0;i<e;i++){
            if(arr[i]<arr[e]){
                ind++;
                int temp=arr[ind];
                arr[ind]=arr[i];
                arr[i]=temp;
            }
        }
        ind++;
         int temp=arr[ind];
                arr[ind]=arr[e];
                arr[e]=temp;

                return ind;

    }
    public static void main(String[] args) {
        int arr[]={5,2,6,4,1,3};
        quick(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
}
