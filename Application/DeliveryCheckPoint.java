public class DeliveryCheckPoint extends CheckPoint {

    DeliveryCheckPoint(String id,String Name,double distance,int expected,int actual){
        super(id,Name,distance,expected,actual);
    }

    public boolean isCritical(){
        return true;
    }

    public String getType(){
        return "Delivery";
    }


    public double calculatePenalty(){
        if(!isDelayed()){
            return 0.0;
        }
        return getDelayMinutes()* 0.2;
    }
    
}
