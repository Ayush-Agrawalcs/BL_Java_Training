package Level3;

import java.util.Scanner;

public class Generate_otp {

    public static int[] Generte(){
        
        int arr[]=new int[10];
        for(int j=0;j<arr.length;j++){
            int k=0;
        for(int i=0;i<6;i++){
            int l=(int)(Math.random()*10);
            k=k*10+l;
        }
        arr[j]=k;
    }
        return arr;
    }

    public static boolean[] unique(int arr[]){
        boolean arr1[]=new boolean[10];
        for(int i=0;i<arr.length;i++){
            int k=arr[i];
            boolean flag=false;
            for(int j=0;j<arr.length;j++){
                if(k==arr[j] || i!=j){
                    flag=true;
                }
                else{
                    flag=false;
                    break;
                }
            }
            if(flag){
                arr1[i]=true;
            }
            else{
                arr1[i]=false;
            }
        }
        return arr1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=Generte();
        boolean arr1[]=unique(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" "+arr1[1]+" is a unique no.");
        }
        
    }
    
}
