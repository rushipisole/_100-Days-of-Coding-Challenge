package Day_24;

import java.util.Arrays;

public class TwoStringArraysareEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(Arrays.toString(new boolean[]{equal(word1, word2)}));
    }

    static boolean equal(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }
}
