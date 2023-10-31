package Day_12;

public class SearchingTheElement {
    public static void main(String[] args) {
        int[] num = {23, 7, 8, 12, 9, 534, 887};
        int target = 534;
        int ans = Search(num, target);
        System.out.println(ans);
    }

    static int Search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}
