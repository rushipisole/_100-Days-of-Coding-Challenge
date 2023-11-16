package Day_24;

import java.util.Arrays;

public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(run(nums)));
    }

    static int[] run(int[] nums) {
        int k = 0;

        for (int i = 0; i < nums.length; i += 2) {
            k += nums[i];
        }

        int[] arr = new int[k];


        int x = 0;
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                arr[x++] = nums[i + 1];
            }
        }
        return arr;
    }
}

