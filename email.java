package Regex;
import java.util.regex.*;

public class email {
    public static void main(String[] args) {
        String email="Ayuhs@gmail.com";
        String regex="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        System.out.println(email.matches(regex));

    }
}
