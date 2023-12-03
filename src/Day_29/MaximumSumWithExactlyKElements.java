package Day_29;

import java.util.Arrays;

public class MaximumSumWithExactlyKElements {
    public static void main(String[] args) {
        int[] ans = {1, 2, 3, 4, 5};
        int target = 3;
        System.out.println(Arrays.toString(new int[]{kElement(ans, target)}));

    }

    static int kElement(int[] nums, int k) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        int ans = 0;
        while (k > 0) {
            ans += max;
            max = max + 1;
            k--;
        }
        return ans;

    }
}
