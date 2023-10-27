package Day_8;

public class ReverseInArrays {
    public static void main(String args[]) {

        int arr[] = {10, 20, 30, 40, 100};

        int n = arr.length;
        for (int i = n - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }

}
