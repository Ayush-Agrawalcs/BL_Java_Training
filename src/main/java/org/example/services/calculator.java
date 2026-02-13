package org.example.services;

public class calculator {
    public static int addtwono(int a,int b){
        return a+b;
    }
    public static int producttwobo(int a,int b){
        return a*b;
    }
    public static double dividetwono(int a,int b){
        return a/b;
    }
    public static int sumnNumbers(int ...number){
        int s=0;
        for(int n:number){
            s+=n;
        }
        return s;
    }
}
