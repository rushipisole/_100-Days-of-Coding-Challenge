package Day_13;

public class MaxWelth {
    public static void main(String[] args) {
        int[][] ans = {
                {1, 2, 3},
                {4, 2, 1},

        };

        System.out.println(MaxWelth(ans));

    }

    static int MaxWelth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];

            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
