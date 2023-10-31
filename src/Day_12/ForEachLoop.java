package Day_12;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        String name = "Naruto";
        //char target = 'r';
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean Search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (target == ch) {
                return true;
            }
        }
        return false;
    }

}
