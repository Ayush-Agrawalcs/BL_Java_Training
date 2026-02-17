package SingleTon;

class Single1{
    static private Single1 instance=null;
    private Single1(){
        System.out.println("Called single constructor");
    }

    static public Single1 getSingle(){
        if(instance==null){
            synchronized (Single1.class) { 
        if(instance==null){
            instance=new Single1();
        }
    }
    }
       return instance;
    }
}
public class Singletonwiththreadsafe {
    public static void main(String[] args) {
        Single1 s1=Single1.getSingle();
        Single1 s2=Single1.getSingle();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
    }
    
}
