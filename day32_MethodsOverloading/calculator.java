package day32_MethodsOverloading;

import java.util.Scanner;

/*
 write a return method that accepts two numbersnu and an operator, then returns calculation result.
             if the oerator is invalid, return zero
             otherwise return the result

 */
public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double firstNum = scan.nextDouble();
        System.out.println("operator");
        char operator = scan.next().charAt(0);
        System.out.println("Enter second number");
        double secondNum = scan.nextDouble();

       double result = calculator(firstNum,operator,secondNum);
        System.out.println("This is the "+ result);

    }


    public static double calculator (double num1, char oper, double num2) {

       double result = (oper == '+')? num1 + num2 :(oper == '-' )? num1 - num2 :
               ( oper == '*')? num1 * num2 :(oper == '/')? num1 /num2 : (oper
               == '%')? num1 % num2 : 0;

       return result;

    }

}
