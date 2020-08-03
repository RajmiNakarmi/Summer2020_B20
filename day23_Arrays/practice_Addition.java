package day23_Arrays;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class practice_Addition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter two numbers");
            double num1 = scan.nextDouble();
            double num2 = scan.nextDouble();

            //double totalNum = num1 + num2;
            System.out.println("Enter an operator");
            char operator = scan.next().charAt(0);

            double result= (operator == '+')? num1 +num2 :(operator =='-')? num1 - num2 :(operator == '/')? num1 / num2
                    : (operator == '*')? num1 * num2 : (operator == '%') ? num1 %num2  : 0;

            System.out.println(result);

            //System.out.println(totalNum);

            System.out.println("Do you want to continue");

            String condition = scan.next();

            while (!(condition.equalsIgnoreCase("yes") || condition.equalsIgnoreCase("No"))) {
                System.out.println("Invalid, Please enter yes or no");

                System.out.println("Do you want to continue");

                condition = scan.next();
            }
                if (condition.equals("no")) {
                    break;
                }


            }
        }
    }
