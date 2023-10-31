package Day_13;

public class EvenDigits {
    public static void main(String[] args) {
        int[] num = {12, 345, 2, 6, 7896, -89};
        System.out.println(FindTheNumbers(num));

    }

    static int FindTheNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigit = digit(num);
        if (numberOfDigit % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digit(int num) {

        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
