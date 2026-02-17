import java.util.*;

public class Mergesort {

    public static void main(String[] args) {
        int arr[] = {34, 54, 6, 5, 4};
        merge(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void merge(int[] arr, int s, int e) {
        if (s < e) {
            int mid = (s + e) / 2;
            merge(arr, s, mid);
            merge(arr, mid + 1, e);
            print(arr, s, mid, e);
        }
    }
    public static void print(int[] arr, int s, int mid, int e) {
        int i = s;        
        int j = mid + 1;  
        int k = 0;

        int[] temp = new int[e - s + 1];

        while (i <= mid && j <= e) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= e) {
            temp[k++] = arr[j++];
        }
        for (int x = 0; x < temp.length; x++) {
            arr[s + x] = temp[x];
        }
    }
}
