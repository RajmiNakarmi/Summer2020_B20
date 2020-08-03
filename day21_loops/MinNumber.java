package day21_loops;

import java.util.Scanner;

public class MinNumber {

    //  write a program that asks user to enter 5 numbers and retuns the maximum number

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min =99999999; // assign possibe max number or
        for (int i = 1; i <= 5; i ++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();  // placed in loop body

            if (num < min) {
                min = num;
            }
        }
        System.out.println("Min number:" + min);
    }
}