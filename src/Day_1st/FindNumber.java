package Day_1st;

import java.util.Scanner;

public class FindNumber {
    public static void main (String[]args)

    {

      Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        if (num > 0)
            System.out.println("The number is positive");
        else if (num < 0)
            System.out.println("The number is negative");
        else
            System.out.println("Zero");

    }
}