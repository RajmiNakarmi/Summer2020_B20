package day22_NestedLoop;

import javafx.scene.transform.Scale;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

/*
  1. Write a program that asks user to enter a string. If string started with uppercase and ends with lowercase letter then print true, otherwise print false
        Ex:
           Input: Cybertek
           output: true
           Input: CyberteK
           output: false

 */
public class UpperLower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String word = scan.next();

        char ch1 = word.charAt(0);
        char ch2 = word.charAt(word.length()-1);

        boolean start = ch1 >= 'A'&& ch1 <= 'Z'; // uppercase
        boolean end = ch2 >= 'a' && ch2 <= 'z'; //lowercase

        System.out.println(start && end);

        /* if( start && end){
            System.out.println("true");
        }else{
            System.out.println("false");
        }*/
    }
}