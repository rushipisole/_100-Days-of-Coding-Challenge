package Day_11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] arr = {56, 89, 1, 67, 45, 98};
        reverse(arr);
        System.out.println(Arrays.toString(arr));;


    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
