package Day_12;

public class SearchInRange {
    public static void main(String[] args) {
        int[] num = {23, 7, 8, 12, 9, 534, 887};
        int target = 8;
        System.out.println(Search(num, target, 1,4));
    }

    static int Search(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i < end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}

