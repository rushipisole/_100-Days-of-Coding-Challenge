package Day_12;

public class SearchTheString {
    public static void main(String[] args) {
        String name = "Naruto";
        char target = 'r';
        System.out.println(Search(name, target));


    }

    static boolean Search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
