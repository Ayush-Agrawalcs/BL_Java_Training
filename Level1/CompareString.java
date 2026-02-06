package Level1;
import java.util.*;

public class CompareString {

    public static boolean compare(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        else{
            for(int i=0;i<s1.length();i++){
                char ch=s1.charAt(i);
                char ch1=s2.charAt(i);
                    if(ch1!=ch){
                        return false; 
                    }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        boolean com=compare(s1,s2);
        // System.out.println(com);
        if(com){
            System.out.println("Both String are equal by without using the in-buit function");
        }
        else{
            System.out.println("Both String are not equal by without using the in-buit function");
        }
        if(s1.equals(s2)){
            System.out.println("Both String are equal by using the in-built function");
        }
        else{
            System.out.println("Both String are not equal by using the in-built function");
        }
    }
    
}
