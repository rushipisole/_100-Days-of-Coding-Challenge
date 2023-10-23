package Day_5;

import java.util.Scanner;

public class Swaping {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;


        swap(a, b);
        System.out.println(a + " " + b);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

    }
}
