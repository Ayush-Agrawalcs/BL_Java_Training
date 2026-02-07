package Stack;

class Stack{
    int top=-1;
    int arr[];
    int size;
    
    Stack(int size){
        this.size=size;
        arr=new int[size];
        top=-1;
    }
    
    void push(int value){
        if(top==size-1){
            System.out.print("Stack overflow");
        }
        else{
            arr[++top]=value;
            System.out.println(value+" value is pushed");
        }
    }
    
    void pop(){
        if(top==-1){
            System.out.print("Stack underflow");
        }
        else{
            System.out.println(arr[--top]+" popped the value");
        }
    }
    
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    
    void peek(){
        if(top==-1){
            System.out.print("Stack is Empty");
        }
        else{
            System.out.println("Top Element "+arr[top]);
        }
    }
}


public class StackImplementation {

    public static void main(String[] args) {
	    Stack st=new Stack(3);
	    st.push(4);
	    st.push(5);
	    st.push(6);
	    st.pop();
	    st.peek();
	    System.out.print(st.isEmpty());
	}
    
}
