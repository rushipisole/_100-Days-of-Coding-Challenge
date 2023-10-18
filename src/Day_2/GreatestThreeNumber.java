package Day_2;

import java.util.Scanner;

public class GreatestThreeNumber {
    public static void main (String[]args)

    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2)
            System.out.println("Number 1 is the Greater");
        else if (num2>num3)
            System.out.println("Number 2 is the Greater");

        else
            System.out.println("Number 3 is the Greater");

    }
}



