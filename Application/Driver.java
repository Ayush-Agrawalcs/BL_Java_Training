public class Driver {
    private String driverId;
    private String name;
    private RouterLinkedList<CheckPoint>list;
    Driver(String driverId,String Name){
        this.driverId=driverId;
        this.name=Name;
        this.list=new RouterLinkedList<>();
    }

    public RouterLinkedList<CheckPoint>getRouteHistory(){
        return list;
    }

    public void print(){
        System.out.println("Driver :" +driverId +"--"+name);
        System.out.println();
        System.out.println("Route Summary");
        list.printRoute();
        double totalDist=list.computeTotalDistance();
        double totalpenal=list.computeTotalPenalty();


        double routescore=totalDist-totalpenal;

        System.out.println();
        System.out.println("1. Total Distaance :"+ totalDist + "km");
        System.out.println("2. Toatal penalty : "+totalpenal);
        System.out.println("3. Router Score :"+routescore);

         if (list.checkConsistency())
            System.out.println("All required checkpoints present");
        else
            System.out.println("Missing critical checkpoints");

    }

}
