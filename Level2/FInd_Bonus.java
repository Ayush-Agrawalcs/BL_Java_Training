package Level2;
import java.util.*;
public class FInd_Bonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int salary[]=new int[10];
        int year[]=new int[10];
        int i=0;
        while(i<10){
            int sal=sc.nextInt();
            int yea=sc.nextInt();
            if(sal>0 && (yea>0)){
                salary[i]=sal;
                year[i]=yea;
                i++;
            }
        }
        int bonus[]=new int[10];
        int newsal[]=new int[10];
        for(int j=0;j<year.length;j++){
            if(year[j]>5){
                int bo=(5*salary[j])/100;
                newsal[j]=salary[j]+bo;
                bonus[j]=bo;
            }
            else{
                int bo=(2*salary[j])/100;
                newsal[j]=salary[j]+bo;
                bonus[j]=bo;
            }
        }

            int totalbonus=0;
            int totalonld=0;
            int totalnew=0;
            for(int j=0;j<10;j++){
                totalbonus+=bonus[j];
                totalonld+=salary[j];
                totalnew+=newsal[j];
            }
            System.out.println("Total bonus: "+totalbonus);
            System.out.println("Total old salary: "+totalonld);
            System.out.println("Total new Salary: "+totalnew);
        }
}
