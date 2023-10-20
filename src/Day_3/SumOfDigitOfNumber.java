package Day_3;

import java.util.Scanner;

public class SumOfDigitOfNumber {
    public static void main(String[] args) {
        int  sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Numbers: ");
        int num = sc.nextInt();

        while (num != 0) {
            sum += num % 10;
            num = num / 10;
            System.out.println("The Sum of all Digits is:" + sum);
        }
    }
}

