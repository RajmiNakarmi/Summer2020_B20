package day16_String;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.Scanner;

public class String_methods {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

    String sentence = "I beleive i can fly, I can touch the sky";

        sentence = sentence.replace("I", "Rajmi");
        System.out.println(sentence);

        sentence= sentence.replace(" i ", " You ");
        System.out.println(sentence);

        //indexOf

        String s1= " I love my Dad and Mom, thank you god";
        int o = s1.indexOf("o");
        int  y= s1.indexOf("yo");
        System.out.println(o);
        System.out.println(y);
        int st = s1.lastIndexOf("om");
        System.out.println(st);
    }
}