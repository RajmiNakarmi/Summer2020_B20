package day21_loops;

import java.util.Scanner;

//  write a program that asks user to enter 5 numbers and retuns the maximum number
public class MaxNumber {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);


     //   int num = scan.nextInt(); //(num is user enter number
        int max = -2147483647;// possibility that user might assign negative numbers.
        for(int i = 10; i<= 50; i +=10){
            System.out.println("Enter a number");
            int num = scan.nextInt();  // placed in loop body

            if(num > max){
                max= num;
            }
        }
        System.out.println("Max number:" +max);
    }

}
