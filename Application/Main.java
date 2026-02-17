public class Main{
    public static void main(String[] args) {
        Driver dr=new Driver("D1204","Kavita Nair");

        dr.getRouteHistory().addcheckpoint(
            new DeliveryCheckPoint("c1","wareHouse A", 40.0,60,70)
        );
        dr.getRouteHistory().addcheckpoint(
            new DeliveryCheckPoint("c4","pump 12", 20.0,15,15)
        );
        dr.getRouteHistory().addcheckpoint(
            new DeliveryCheckPoint("c3","Motel X", 30.0,30,35)
        );
        dr.getRouteHistory().addcheckpoint(
            new DeliveryCheckPoint("c2","Client Hub", 30.0,45,60)
        );

        dr.print();
    }
}