package day15_String;

import javax.script.ScriptContext;
import java.util.Scanner;

public class Practice1 {
    // write a progam that asks the user enter first name then last name.
    //print the initails of the person



    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = input.next();// assume user enter cybertek
    char ch1 = firstName.charAt(0);

            System.out.println("Enter your Last name:");
        String lastName = input.next();
        char ch2 = lastName.charAt(0);

        System.out.println("Your initial is:" +ch1 +ch2);

        System.out.println("=====================================================");

       

    }
}
