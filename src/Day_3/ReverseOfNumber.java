package Day_3;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int reverse = 0, rev;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num = sc.nextInt();


        while (num != 0) {
            rev = num % 10;
            reverse = reverse * 10 + rev;
            num /= 10;
        }
        System.out.println("The Reverse Number is: " + reverse);

    }
}
