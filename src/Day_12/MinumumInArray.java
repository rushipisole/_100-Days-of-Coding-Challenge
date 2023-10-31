package Day_12;

public class MinumumInArray {
    public static void main(String[] args) {
        int[] arr = {89, 34, 876, 23, 5346, 67, 9};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];

            }

        }
        return ans;
    }
}
