package Queue;

class Queue{
    static int arr[];
    static int size;
    static int rear=-1;
    static int fear=-1;
    Queue(int n){
        this.size=n;
        this.arr=new int[n];
    }
    public boolean isEmpty(){
        return rear==-1;
    }

    public void enqueue(int data){
        if(rear==size-1){
            System.out.println("over flow");
            return;
        }
        rear+=1;
        arr[rear]=data;
    }

    public int peek(){
        if(rear==-1){
            System.out.println("Queue is Empty");
            return -1;
        }
      
        return arr[rear];
    }
    public int dequeue(){
        if(rear==-1){
            System.out.println("Queue is Empty");
            return -1;
        }
        fear=arr[0];
        for(int i=0;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return fear;

    }
}

public class implementionusingarrray {
    public static void main(String[] args) {
        Queue q=new Queue(2);
        q.enqueue(5);
        q.enqueue(9);
          System.out.println(q.peek());

       System.out.println(q.dequeue());
        System.out.println(q.peek());
         System.out.println(q.isEmpty());
    }
    
}
