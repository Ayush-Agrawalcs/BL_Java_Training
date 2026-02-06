package Level1;
import java.util.*;

public class CreateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        char arr[]=s1.toCharArray();
        char arr1[]=convert2array(s1);
        boolean flag=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr1[i]){
                flag=false;
                break;
            }
        }
        if(!flag){
            System.out.println("Both array are not equal");
        }
        else{
            System.err.println("Both array are not equal equal");
        }

    }
    public static char[] convert2array(String s1){
        int count=0;
        for(int i=0;i<s1.length();i++){
            count++;
        }
        char ch[]=new char[count];
        for(int i=0;i<s1.length();i++){
            char ch1=s1.charAt(i);
            ch[i]=ch1;
        }
        return ch;
    }
    
}
