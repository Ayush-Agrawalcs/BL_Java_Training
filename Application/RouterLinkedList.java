public class RouterLinkedList <T extends CheckPoint> {
    private class Node{
        T data;
        Node next;

        Node(T data){
            this.data=data;
        }
    }

    private Node head;
    private Node tail;

    public void addcheckpoint(T CheckPoint){
        Node newnode=new Node(CheckPoint);
        if(head==null){
            head=newnode;
        }
        else{
            tail.next=newnode;
        }
        tail=newnode;
    }

    public boolean removecheckpoint(String CheckpointId){
        if(head==null)return false;

        if(head.data.getCheckpointId().equals(CheckpointId)){
            head=head.next;
            return true;
        }

        Node prev=head;
        Node curr=head.next;
        while(curr!=null){
            if(curr.data.getCheckpointId().equals(curr)){
                prev.next=curr.next;
                return true;
            }
            prev=curr;
            curr=curr.next;
        }
        return false;
    }

    public T findCheckPoint(String checkpointId){
        Node temp=head;
        while(temp!=null){
             if (temp.data.getCheckpointId().equals(checkpointId))
                return temp.data;

            temp = temp.next;
        }
        return null;
    }

    public double computeTotalDistance(){
        double total=0;
        Node temp=head;

        while(temp!=null){
            total+=temp.data.getDistanceFromLast();
            temp=temp.next;
        }
        return total;
    }

    public double computeTotalPenalty(){
        double total=0;
        Node temp=head;
        while(temp!=null){
            total+=temp.data.calculatePenalty();
            temp=temp.next;
        }
        return total;
    }

    public void printRoute(){
        Node temp=head;
        int i=1;
        while(temp!=null){
           CheckPoint c = temp.data;
           System.out.println(i+"-"+c.getType()+" checkPoint ->"+c.getlocationName()+" - "+(c.isDelayed()?"Delayed":"onTime")+"- penalty "+c.calculatePenalty());

           temp=temp.next;
           i++;

        }

    }

    public boolean checkConsistency() {

        boolean hasDelivery = false;
        boolean hasFuel = false;

        Node temp = head;

        while (temp != null) {

            CheckPoint c = temp.data;

            if (c.isCritical()) {

                if (c.getType().equalsIgnoreCase("Delivery"))
                    hasDelivery = true;

                if (c.getType().equalsIgnoreCase("Fuel"))
                    hasFuel = true;
            }

            temp = temp.next;
        }

        return hasDelivery && hasFuel;
    }

    
}
