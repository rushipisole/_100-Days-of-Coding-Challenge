package Day_6;

public class SmallestNumberInArrays {
    public static void main(String args[]) {

        int arr[] = {20, 67, 69, 106, 54, 45, 18, 1};

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

        }

        System.out.print(min);
    }
}
