package Day_32;

public class MaximumProductDifferenceBetweenTwoPairs {
    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 7, 4};
        int ans = differnce(arr);
        System.out.println(ans);
    }

    static int differnce(int[] nums) {
        int max = Integer.MIN_VALUE, max1 = Integer.MIN_VALUE, min = Integer.MAX_VALUE, min1 = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num >= max) {
                max1 = max;
                max = num;
            } else if (num > max1)
                max1 = num;

            if (num <= min) {
                min1 = min;
                min = num;
            } else if (num < min1)
                min1 = num;
        }
        return (max * max1) - (min * min1);
    }
}

