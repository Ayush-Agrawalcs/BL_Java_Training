public class RestCheckPoint extends CheckPoint {
    RestCheckPoint(String id,String Name,double distance,int expected,int actual){
           super(id,Name,distance,expected,actual);
    }

     public boolean isCritical(){
        return false;
    }

    public String getType(){
        return "Rest";
    }

    public double calculatePenalty(){
        int delay=getDelayMinutes();
        if(delay>30){
            return delay*0.05;
        }
        return 0.0;
    }
    
}
