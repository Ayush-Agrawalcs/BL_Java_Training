public class findorder {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    static class linked{
        static Node find(Node a){
            Node dummy=new Node(-1);
            Node oddd=new Node(-1);
            Node evenn=new Node(-1);
            Node temp=a;
            Node od=oddd;
            Node ev=evenn;
            Node curr=dummy;
 while (temp != null) {
    if (temp.data % 2 != 0) {
        od.next = temp;
        od = od.next;
    }
    else{
         ev.next=temp;
        ev=ev.next;
    }
    temp = temp.next;
}
od.next = null;   
ev.next=null;

            curr.next = oddd.next;
            od.next = evenn.next;
            

            return dummy.next;

        }
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node c = new Node(13);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f=new Node(12);
        Node i=new Node(10);
        Node g=new Node(14);
        a.next = c;
        c.next = d;
        d.next = e;
        e.next=f;
        f.next=i;
        i.next=g;

        Node z=linked.find(a);
        while (z!=null) {
            System.out.println(z.data+" ");
            z=z.next;
        }
    }
    
}
