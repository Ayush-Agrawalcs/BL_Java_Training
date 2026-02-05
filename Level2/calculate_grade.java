package Level2;
import java.util.*;

public class calculate_grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int student=sc.nextInt();

        int physics[]=new int[student];
        int chemistry[]=new int[student];
        int math[]=new int[student];
        double percentage[]=new double[student];
        char grade[]=new char[student];
        for(int i=0;i<student;i++){
            physics[i]=sc.nextInt();
            if(physics[i]<0){
                 System.out.println("Invalid marks! Enter positive value.");
                i--;
                continue;
            }
            chemistry[i]=sc.nextInt();
            if (chemistry[i] < 0) {
                System.out.println("Invalid marks! Enter positive value.");
                i--;
                continue;
            }

            math[i]=sc.nextInt();
              if (math[i] < 0) {
                System.out.println("Invalid marks! Enter positive value.");
                i--;
                continue;
            }

            percentage[i]=(physics[i]+chemistry[i]+math[i])/3.0;
              if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 75)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 40)
                grade[i] = 'D';
            else
                grade[i] = 'F';
            
        }

           for (int i = 0; i < student; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + physics[i]);
            System.out.println("Chemistry: " + chemistry[i]);
            System.out.println("Maths: " + math[i]);
            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade: " + grade[i]);
            System.out.println("--------------------------");
        }
    }
}
