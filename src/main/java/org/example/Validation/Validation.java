package org.example.Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public boolean isValidateemail(String email){
        String regex="^[a-zA-z0-9._+&%]+@[a-zA-Z0-9 ._&%]+\\.[a-zA-Z]{2,}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(email);
        return matcher.matches();
    }

    public boolean isvalidateStudentId(String id){
        String regex="STU[0-9]{3}";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(id);
        return matcher.matches();
    }
}
