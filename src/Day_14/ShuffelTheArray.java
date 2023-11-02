package Day_14;

public class ShuffelTheArray {
    public static void main(String[] args) {
        int [] n = {2,5,1,3,4,7};
        int ans = 3;
        int[] target = Array(n,ans);
        System.out.println(target);


    }

    static int[] Array(int[] nums, int n) {

        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[(2 * i) + 1] = nums[i + n];
        }
        return ans;
    }
}
