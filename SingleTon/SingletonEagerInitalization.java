 package SingleTon;


 class Single2{
    static private Single2 instance=new Single2();
    private Single2(){
        System.out.println("Called single constructor");
    }

    static public Single2 getSingle(){
       return instance;
    }
}

public class SingletonEagerInitalization {
public static void main(String[] args) {
    Single2 s1=Single2.getSingle();
        Single2 s2=Single2.getSingle();
        System.out.println(s1==s2);
}
    
}