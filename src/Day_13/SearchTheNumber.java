package Day_13;

public class SearchTheNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 9, 12, 34, 56};
        int target = 34;
        int ans = Search(arr, target);
        System.out.println(ans);

    }

    static int Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;

            }else{
                return mid;
            }


        }
        return -1;
    }
}
