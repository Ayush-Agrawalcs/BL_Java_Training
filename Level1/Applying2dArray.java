package Level1;
import java.util.*;

public class Applying2dArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int arr1[]=new int[row*col];
        int y=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[y]=arr[i][j];
            }
        }

        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]+" ");
        }
    }
}
