package day11_NestedIf_switch;

import java.util.Scanner;

public class UserInput_Practice1 {
    /*

     */

    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        double num = scan.nextDouble();


        String result = (num%2 == 0)? num +" is Even" : num +" is odd";
        System.out.println(result);
    }
}
