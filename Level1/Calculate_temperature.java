package Level1;
import java.util.*;

public class Calculate_temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temperature=sc.nextInt();
        int windSpeed=sc.nextInt();
        double sum=Calculate_windchil(temperature,windSpeed);
        System.out.println("The windchill temperature is: "+sum);
    }

    public static double Calculate_windchil(int tem,int win){
        double windchill=35.74+0.6215*(double)tem+(0.4257*(double)tem-35.75)* Math.pow((double)win,0.16);
        return windchill;
    }
}
