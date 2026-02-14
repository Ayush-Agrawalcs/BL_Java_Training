package Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validationutil {

    public boolean ValidateEmail(String email){
        String regex="^[a-zA-z0-9._%+-]+@[a-zA-z.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(email);
        return matcher.matches();
    }
    public boolean Validatephonel(String phone){
        String regex="[0-9]{10}";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(phone);
        return matcher.matches();
    }
}
