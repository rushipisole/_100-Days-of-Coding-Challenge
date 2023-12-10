package Day_34;

import java.util.Arrays;

public class TruncateSentence {
    public static void main(String[] args) {
        String[] arr = {"Hello how are you Contestant"};
        int target = 4;
        int ans = Integer.parseInt(Arrays.toString(new String[]{sentences(Arrays.toString(arr), target)}));
        System.out.println(ans);

    }

    static String sentences(String s, int k) {
        String arr[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            if (i < arr.length) {
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
}

