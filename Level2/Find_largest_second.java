package Level2;
import java.util.*;
public class Find_largest_second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int arr[]=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        int secondlargest=arr[1];
        for(int i=2;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
                secondlargest=largest;
            }
            if(secondlargest<arr[i] && largest!=secondlargest){
                secondlargest=arr[i];
            }
        }
        System.out.println("largest no.: "+largest);
        System.out.println("gratest no.: "+secondlargest);
    }
}
