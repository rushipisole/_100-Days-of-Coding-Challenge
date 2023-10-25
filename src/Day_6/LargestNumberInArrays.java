package Day_6;

public class LargestNumberInArrays {
    public static void main(String args[]) {

        int arr[] = {20, 67, 69, 106, 54, 45, 18, 1};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }

        System.out.print(max);
    }
}

