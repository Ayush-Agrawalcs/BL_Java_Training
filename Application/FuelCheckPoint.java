public class FuelCheckPoint extends CheckPoint{

    FuelCheckPoint(String id,String Name,double distance,int expected,int actual){
        super(id,Name,distance,expected,actual);
    }


    public boolean isCritical(){
        return true;
    }

    public String getType(){
        return "Fuel";
    }

    public double calculatePenalty(){
        if(isDelayed()){
            return 10.0;
        }
        return 0.0;
    }
    
}
