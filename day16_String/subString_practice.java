package day16_String;

import java.util.Scanner;

public class subString_practice {
/* 1. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word");
        String strl = scan.next();//"apple

        System.out.println("enter your seccond word");
        String str2 = scan.next();// banana

        String result = strl.substring(1).concat (str2.substring(1));
        System.out.println(result);
    }
}
