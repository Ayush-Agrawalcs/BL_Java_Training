package Level1;
import java.util.*;

public class Max_Handshake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=handshake(n);
        System.out.println("Total no, of possible handshake: "+ans);
    }
    public static int handshake(int n){
        int shake=(n*(n-1))/2;
        return shake;
    }
    
}
