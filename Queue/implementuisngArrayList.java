package Queue;
import java.util.*;

class Queue1{
    static ArrayList<Integer>arr=new ArrayList<>();
    static int rear=-1;
    static int fear=-1;
    public boolean isEmpty(){
        return arr.isEmpty();
    }

    public void enqueue(int data){
        arr.add(data);
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr.get(0);
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr.remove(0);
    }
}
public class implementuisngArrayList {
    public static void main(String[] args) {
         Queue1 q=new Queue1();
        q.enqueue(5);
        q.enqueue(9);
          System.out.println(q.peek());

       System.out.println(q.dequeue());
        System.out.println(q.peek());
         System.out.println(q.isEmpty());
    }
    
}
