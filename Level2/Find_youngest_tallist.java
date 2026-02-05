package Level2;
import java.util.*;
public class Find_youngest_tallist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age[]=new int[3];
        int height[]=new int[3];
        for(int i=0;i<3;i++){
            age[i]=sc.nextInt();
            height[i]=sc.nextInt();
        }
        int youngest=age[0];
        int tallest=height[0];
        for(int i=1;i<3;i++){
            if(youngest>age[i]){
                youngest=age[i];
            }
            if(tallest<height[i]){
                tallest=height[i];
            }
        }
        System.out.println("Youngest age is: "+youngest);
        System.out.println("Tallest height is: "+tallest);
    }
    
}
