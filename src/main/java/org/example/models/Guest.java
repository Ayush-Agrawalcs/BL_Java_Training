package org.example.models;

public class Guest {
    private String name;
    private String email;
    private String phone;
    public Guest(String name, String email, String phone){
        this.email=email;
        this.name=name;
        this.phone=phone;
    }

    public String getName(){
        return name;
    }

    public  String  getEmail(){
        return email;
    }

    public  String getPhone(){
        return phone;
    }

}
