package Day_30;

import java.util.Arrays;

public class CountEqualandDivisiblePairsinanArray {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 2, 2, 1, 3};
        int target = 2;
        System.out.println(Arrays.toString(new int[]{pair(nums, target)}));

    }

    static int pair(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && ((i * j) % k == 0)) {
                    count++;
                }
            }
        }
        return count;
    }
}
