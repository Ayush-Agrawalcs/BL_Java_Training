// public class Test {
    
// }

interface Printable{
void print();
    
}
class MyNumber extends Number implements Printable{
    private final int value;
    MyNumber(int value){
        this.value=value;
    }

    public void print(){
        System.out.println(value);
    }

    public int intValue(){
        return value;
    }

    public long longValue(){
        return value;
    }

    public float floatValue(){
        return value;
    }

    public double doubleValue(){
        return value;
    }

}

class Boxx<T extends Number & Printable>{

    private T item;

    public Boxx(T item){
        this.item=item;
    }

    public void display(){
        item.print();
    }

    public T getitem(){
        return item;
    }

}

public class Test{
    public static void main(String[] args) {
        MyNumber mynumber=new MyNumber(22);
        Boxx<MyNumber>box=new Boxx<>(mynumber);
        box.getitem();
    }
    
}
