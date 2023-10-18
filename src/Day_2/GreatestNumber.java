package Day_2;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > num2) System.out.println("Number 1 is the Greater");

        else System.out.println("Number 2 is the Greater");

    }
}

