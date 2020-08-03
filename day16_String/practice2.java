package day16_String;

import java.util.Scanner;

public class practice2 {
    // ask the user if he /she is employeed
    // if the user says yes, print "employeed"
    //otherwise == unemployeed
    //yes,Yes,YES,yEs,

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you Employeed?");

        String answer = scan.next();
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Employeed");
        }else{
            System.out.println("Not Employeed");
        }
    }
}
