package Regex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RE {
    public static void checkStringAgainstRE(String re,String str){
        Pattern pattern=Pattern.compile(re);
        Matcher matcher= pattern.matcher(str);
        boolean matches=matcher.matches();
        System.out.println(matches);
        // [a-z] represent single character
        //[0-9]{10} means the number is belong to 0 to p and length must be 10
    }
    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            String re = sc.nextLine();
            String str = sc.nextLine();
            checkStringAgainstRE(re, str);
            System.out.println("Enter y");
            String choice=sc.next();
            if(choice.equals("y"))
                break;
        }

    }
}
