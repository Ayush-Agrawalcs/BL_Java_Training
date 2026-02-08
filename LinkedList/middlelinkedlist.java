public class middlelinkedlist {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static class Linked {
        static Node middle(Node head) {
            Node fast = head;
            Node slow = head;
            while (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }
         static Node demiddle(Node head) {
            Node fast = head;
            Node slow = head;
            while (fast.next != null && fast.next.next!= null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            slow.next=slow.next.next;
            return head;
            
        }

    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node c = new Node(13);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f=new Node(12);
        Node i=new Node(10);
        a.next = c;
        c.next = d;
        d.next = e;
        e.next=f;
        f.next=i;

        Node h = Linked.middle(a);
        System.out.println(h.data);

        Node k=Linked.demiddle(a);
        while(k!=null){
            System.out.println(k.data);
            k=k.next; 
        }
    }
}
