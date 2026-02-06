package Level3;

import java.util.Scanner;

public class NumberChecker3 {

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

    public static int[] arrayreverse(int arr[]) {
        int reverse[] = new int[arr.length];
        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse[k] = arr[i];
            k++;
        }
        return reverse;

    }

    public static boolean compare(int number[], int sum[]) {
        for(int i=0;i<number.length;i++){
            if(number[i]!=sum[i]){
                return false;
            }
        }
         return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int arr[] = Storedarray(k);
        int arrayrev[] = arrayreverse(arr);
        boolean harshad = compare(arr,arrayrev);

        System.out.println("Digits:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Reverse");
        for (int i = 0; i < arrayrev.length; i++) {
            System.out.println(arrayrev[i]+" ");
        }
        System.out.println(harshad+" is both array is equal");
        System.out.println("pallendrome check: " + harshad);
    }

}
