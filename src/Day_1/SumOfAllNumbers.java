package Day_1;

import java.util.Scanner;

public class SumOfAllNumbers {

        public static void main (String[]args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int sum = (num2*(num2+1)/2 - num1*(num1+1)/2 + num1 );
            System.out.println("The Sum of all Numbers is: " +sum);
        }
    }


