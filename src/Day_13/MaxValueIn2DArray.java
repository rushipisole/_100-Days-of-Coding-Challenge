package Day_13;

import java.util.Arrays;

public class MaxValueIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 67, 90, 2},
                {678, 93, 47, 1},
                {56, 12, 345, 764}

        };

        System.out.println(Search(arr));
    }

    static int Search(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }

            }

        }
        return max;

    }
}
