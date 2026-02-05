package Level1;
import java.util.*;

public class Football_team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double arr[]=new double[12];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        double sum=0.0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double mean=sum/11;
        System.out.println("mean of fottball team is"+mean);

    }
    
}
