package Day_3;

import java.util.Scanner;

//public class AllPrimeNumber {
//    public static void main(String[] args) {
//        int i, j;
//        Scanner sc = new Scanner(System.in);
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//
//        for (i = n1; i <= n2; i++) {
//            for (j = 2; j <= i; j++) {
//                if (i % j == 0) {
//                    break;
//                }
//                if (i == j) {
//                    System.out.println(j);
//                }
//            }
//        }
//    }
//}

public class Main {
    public static void main(String[] args) {
        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for (int i = n1; i <= n2; i++)
            if (isPrime(i))
                System.out.println(i);
    }
    static boolean isPrime(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        System.out.println("Your Numbers is:");
        return true;
    }
}