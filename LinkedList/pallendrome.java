public class pallendrome {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class Linked{
        public static boolean pallen(Node a){
            int count=0;
            Node temp=a;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            temp=a;
            Node dummy=new Node(-1);
            Node curr=dummy;
            for(int i=1;i<count/2;i++){
                temp=temp.next;
            }
            Node b=temp.next;
            temp.next=curr.next;
            curr.next=b;
            Node head=curr.next;
            Node prev=null;
            Node nex=null;
            while(head!=null){
                nex=head.next;
                head.next=prev;
                prev=head;
                head=nex;
            }
            temp=a;
            while(prev!=null){
                if(prev.data!=temp.data){
                    return false;
                }
                prev=prev.next;
                temp=temp.next;

            }
            return true;
        } 
        

    }
    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(1);
        Node c=new Node(2);
        Node d=new Node(2);
        a.next=b;
        b.next=c;
        c.next=d;

        System.out.println(Linked.pallen(a));



    }

    
}
