package day11_NestedIf_switch;
import java.util.Scanner;
/*
write a program that can ask you to enter two number, and the prints the sum of those two number
Enter your first number
10
enter your second number
20
 */
public class task_userinput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");

        int num = scan .nextInt();
        System.out.println("Enter second number ");
        int num1 = scan .nextInt();
        System.out.println("sum of those numbers are: " + (num +num1));




    }
}
