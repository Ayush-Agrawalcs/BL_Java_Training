
import java.util.*;

public class implementation{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class linkedlist{
        Node head=null;
        Node tail=null;

        void insertatend(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
            }
            else{
                tail.next=newNode;             
            }
            tail=newNode;
        }

        void insertatfirst(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                newNode.next=head;
                head=newNode;
            }

        }
        void insertatmiddle(int data,int val){
            Node n=new Node(val);
            if(data==head.data){
                insertatfirst(data);
                return;
            }
            if(tail.data==data){
                tail.next=n;
                tail=n;
                return;
            }
            Node k=head;
            while(k.next!=null && k.next.data!=data){
                k=k.next;
            }

            n.next=k.next;
            k.next=n;
        }
         void print(){
            Node curr=head;
            while(curr!=null){
                System.out.print(curr.data+"-->");
                curr=curr.next;
            }
            System.out.println();

        }
        void reverser(Node a){
            if(a==null){
                return;
            }
            reverser(a.next);
            System.out.print(a.data+"-->");
        }

        void reversew(){
            Node curr=head; // 10
            Node prev=null;
            Node next=null;
            while(curr!=null){
                next=curr.next; //5
                curr.next=prev; //5
                prev=curr;
                curr=next;
            }
            head=prev;
        }
        
        Node deleteend(Node a){
            if(a==null){
                return null;
            }
            Node c=a;
            while(c.next.next!=null){
                c=c.next;
            }
            c.next=null;
            return a;
            
           
        }
        void deletefirst(){
            if(head==null){
                return ;
            }
            Node prev=head.next;
            head=prev;
        }
    }
    public static void main(String []args){
        linkedlist a=new linkedlist();
        a.insertatend(5);
       a.insertatend(6);
        a.insertatend(7);
        a.insertatend(8);
        a.print();
        a.insertatfirst(10);
        a.print();
        a.insertatmiddle(6,5);
        a.print();
        // reverse using recursion
        a.reverser(a.head);

        // reverse using loop
        a.reversew();
        a.print();

        // deletefirst
        a.deletefirst();
        a.print();
        
        // deleteatend
        Node c=a.deleteend(a.head);
        while(c!=null){
            System.out.print(c.data+"-->");
            c=c.next;
        }
    }
}