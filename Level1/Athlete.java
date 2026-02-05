package Level1;
import java.util.*;

public class Athlete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int perimeter=x+y+z;
        double distance=Round_check(perimeter);
        System.out.println("The number of rounds completed by athlete "+ distance);
    }
    public static double Round_check(int p){
        double c=5000/((double)p);
        return c;
    }
    
}
