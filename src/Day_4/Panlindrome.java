package Day_4;

import java.util.Scanner;

public class Panlindrome {
    public static void main(String[] args) {
        int reverse = 0, rev, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int num = sc.nextInt();

        temp = num;


        while (temp != 0) {
            rev = temp % 10;
            reverse = reverse * 10 + rev;
            temp /= 10;
        }
        if (num == reverse)
            System.out.println("The Number is Palimdrome");
        else
            System.out.println("The Number is Not Palindrome");

    }
}
