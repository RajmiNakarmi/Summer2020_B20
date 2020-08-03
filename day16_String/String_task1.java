package day16_String;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
/*
 1. write a program that ask user to enter sentence.
        then print out the first and last characters */
public class String_task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Sentence");
        String sentence = scan.nextLine();

        char firstletter = sentence.charAt(0);
        char secondletter =sentence.charAt(sentence.length()-1);

        System.out.println("first character: " + firstletter +  " last character: "+secondletter);

    }
}
