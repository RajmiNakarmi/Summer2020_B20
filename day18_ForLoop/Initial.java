package day18_ForLoop;

import java.util.Scanner;

public class Initial {
    /*
    4. write a program that asks user's first and last name, then prints out the initials of the user

                input:

                    cybertek
                    batch18
                output:
                    your initial is: CB
        DO NOT use charAt method

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firstName = "cybertek";
        String lastName = "school";

        firstName.substring(0,1);
        lastName.substring(0,1);

String intial= firstName.substring(0,1) + lastName.substring(0,1);
intial = intial.toUpperCase();
        System.out.println(intial);


    }
}
