package Day_11;

public class MaxValueInRange {
    public static void main(String[] args) {

        int[] arr = {1,3,56,89};
        System.out.println(maxRange(arr, 1,3));
    }
    static int maxRange(int[] arr, int start, int end) {
        int maxVal = arr[0];
        for (int i=start; i<end; i++){
            if (arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;


}}
