package Day_29;

import java.util.Arrays;

public class MinimumNumbesofMovestoSeatEveryone {
    public static void main(String[] args) {
        int[] ans = {4,1,5,9};
        int[] ans2 = {1,3,2,6};
        System.out.println(Arrays.toString(new int[]{Numbers(ans, ans2)}));


    }

    static int Numbers(int[] seats, int[] students) {
        Arrays.sort(students);
        Arrays.sort(seats);

        int result = 0;
        for (int i = 0; i < seats.length; i++) {
            result += Math.abs(seats[i] - students[i]);
        }
        return result;
    }
}

