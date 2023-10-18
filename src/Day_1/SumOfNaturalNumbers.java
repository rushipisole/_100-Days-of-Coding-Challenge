package Day_1;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();

        System.out.println(num*(num+1)/2);
    }
}
