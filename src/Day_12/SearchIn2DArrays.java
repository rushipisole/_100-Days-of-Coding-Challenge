package Day_12;

import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 67, 90, 2},
                {678, 93, 47, 1},
                {56, 12, 345, 764}

        };
        int target = 345;
        int[] ans = Search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] Search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }

            }

        }
        return new int[]{-1, -1};

    }
}
