public abstract class CheckPoint{
    protected String checkpointId;
    protected String locationName;
    protected double distancefromLast;
    protected int expectedDuration;
    protected int actualDuration;

    CheckPoint(String checkpointId,String locationName, double distancefromLast,int expectedDuration,int actualDuration){
        this.checkpointId=checkpointId;
        this.locationName=locationName;
        this.distancefromLast=distancefromLast;
        this.expectedDuration=expectedDuration;
        this.actualDuration=actualDuration;
    }
public String getCheckpointId(){
    return checkpointId;
}

public String getlocationName(){
    return locationName;
}

public double getDistanceFromLast(){
    return distancefromLast;
}

public boolean isDelayed(){
    return actualDuration>expectedDuration;
}

 public int getDelayMinutes() {
        return Math.max(0, actualDuration - expectedDuration);
    }

    public abstract String getType();
    public abstract double calculatePenalty();
    public abstract boolean isCritical();


}