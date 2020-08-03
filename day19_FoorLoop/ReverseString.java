package day19_FoorLoop;

import java.util.Scanner;

public class ReverseString {
    // 1. write a program that can reverse any string
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str =scan .nextLine();

       // String str = "Cyber";//rebyC
       // String result =" "+ str.charAt(str.length()-1)+ str.charAt(3)+ str.charAt(2)+ str.charAt(1)+
        //str.charAt(0);
        //System.out.println(result);

        // using loop
        String result =" ";
        for(int i = str.length()-1; i >=0; i--) {
            result += str.charAt(i);
        }
            System.out.println(result);

    }
}
