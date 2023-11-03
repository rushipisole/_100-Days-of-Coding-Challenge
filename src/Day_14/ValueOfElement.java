//package Day_14;
//
//import java.util.Arrays;
//
//public class ValueOfElement {
//    public static void main(String[] args) {
//        String[] arr = {"--X", "X++", "X++"};
//        System.out.println(Arrays.toString(Value(arr)));
//
//
//    }
//
//    static int Value(String[] arr, int x) {
//        for (int i = 0; i < arr.length; i++) {
//            String o = arr[i];
//            if (o.charAt(1) == '-') {
//                x--;
//            } else {
//                x++;
//            }
//
//        }
//        return x;
//    }
//}