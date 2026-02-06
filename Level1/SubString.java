package Level1;
import java.util.*;

public class SubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next(); 
        int start=sc.nextInt();
        int last=sc.nextInt();
       String l=sub(s1,start,last);
       String c=sub1(s1,start,last);
       System.out.println(c);
       System.out.println(l);
       if(compare(l,c)){
        System.out.println("Both String are Equal");
       }
       else{
        System.out.println("Both String are not Equal");
       }

    }

    public static String sub(String s1,int start,int last)
    {
        return s1.substring(start,last);
    }

    public static boolean compare(String p,String c){
        return p.equals(c);
    }

    public static String sub1(String p,int start,int last){
        String y="";
        for(int i=start;i<last;i++){
            char ch=p.charAt(i);
            y+=ch;
        }
        return y;
    }
}
