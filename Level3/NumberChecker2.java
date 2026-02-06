package Level3;
import java.util.*;


public class NumberChecker2 {

    public static int[] Storedarray(int digit) {
        int k = digit;
        int count = 0;

        while (digit > 0) {
            count++;
            digit /= 10;
        }

        int arr[] = new int[count];
        int j = count - 1;

        while (k > 0) {
            arr[j] = k % 10;
            j--;
            k /= 10;
        }
        return arr;
    }

    public static int arraysum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int arraysquaresum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] * arr[i]; // better than Math.pow
        }
        return sum;
    }

    // CORRECT Harshad logic
    public static boolean harshad(int number, int sum) {
        return number % sum == 0;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int arr[] = Storedarray(k);
        int arraysum = arraysum(arr);
        int arraysquaresum = arraysquaresum(arr);
        boolean harshad = harshad(k, arraysum);

        System.out.println("Digits:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Harshad Number: " + harshad);
        System.out.println("Total sum is: " + arraysum);
        System.out.println("Total square sum is: " + arraysquaresum);
    }
}
