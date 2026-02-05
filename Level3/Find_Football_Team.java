package Level3;
import java.util.*;
public class Find_Football_Team {
    public static void main(String[] args) {
        int arr[]=new int[12];
        for(int i=0;i<arr.length;i++){
            int rand=(int)(Math.random()*101)+150;
            arr[i]=rand;
        }

        int sumofheight=sum(arr);
        double meanofheight=mean(sumofheight);
        int shortestheight=shortest(arr);
        int tallestheight=tallest(arr);
        System.out.println("Sum of the height: "+sumofheight);
        System.out.println("Mean of the height: "+meanofheight);
        System.out.println("Shortest of height: "+shortestheight);
        System.out.println("Tallest of hieght: "+tallestheight);


    }
    public static int sum(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static double mean(int sum){
        double k=(double)(sum)/11.0;
        return k;
    }

    public static int shortest(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }

    public static int tallest(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
