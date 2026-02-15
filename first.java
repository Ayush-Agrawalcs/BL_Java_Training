package Regex;
import java.util.regex.*;

public class first {
    public static void main(String[] args) {
        String s="I have 2 apples and 10 oranges";
        Pattern pattern=Pattern.compile("\\d+");
        Matcher matcher=pattern.matcher(s);
//        boolean res=s.matches("\\d+");
//        System.out.println(res);;
        while(matcher.find()){
            System.out.println(matcher.group());
        }


    }
}
