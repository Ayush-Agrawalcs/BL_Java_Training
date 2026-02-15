package Regex;
import java.util.regex.*;

public class split {
    public static void main(String[] args) {
        String data="apple,banana,orange";
        String arr[]=data.split("[,:]");

        for(String ar:arr){
            System.out.println(ar);
        }
    }
}
