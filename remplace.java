package Regex;
import java.util.regex.*;

public class remplace {
    public static void main(String[] args) {
        String j="java123 is456 fun";
        String result=j.replaceAll("\\d+"," ");
        System.out.println(result);
    }
}
