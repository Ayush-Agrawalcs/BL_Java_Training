package Level1;
import java.util.*;
public class Multipication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int arr[]=new int[11];
        for(int i=1;i<=10;i++){
            arr[i]=i*k;
        }
        for(int i=1;i<=10;i++){
            System.out.println(k + " * " + i +" = "+arr[i]);
        }
    }
}
