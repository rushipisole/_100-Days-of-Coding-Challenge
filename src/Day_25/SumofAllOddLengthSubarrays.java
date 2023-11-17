package Day_25;

import java.util.Arrays;

public class SumofAllOddLengthSubarrays {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        System.out.println(Arrays.toString(length(arr)));

    }

    static int[] length(int[] arr) {

        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum = sum + ((i + 1) * (n - i) + 1) / 2 * arr[i];
        }
        return new int[]{sum};
    }

}
