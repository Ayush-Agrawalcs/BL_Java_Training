package SingleTon;
// we are not creating more than one object
//It is not a thread safe;
class Single{
    static private Single instance=null;
    private Single(){
        System.out.println("Called single constructor");
    }

    static public Single getSingle(){
        if(instance==null){
            instance=new Single();
        }
       return instance;
    }
}

public class Singleton {
    public static void main(String[] args) {
        Single s1=Single.getSingle();
        Single s2=Single.getSingle();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
    }
}