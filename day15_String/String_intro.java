package day15_String;

 import java.lang.String;
 import java.util.Scanner;

public class String_intro {
    public static void main(String[] args) {
        String str = "Cybertek";
        Scanner input = new Scanner(System.in);

        //example

        String s1 = "cat"; // string literal
        String s2 = "cat"; // string literal

        System.out.println(s1 == s2);

        String d1 = "Dog";
        String d2 = "dog";
        System.out.println();

        //
        String t1 = new String("Tiger");
        String t2 = new String("Tiger");
        System.out.println(t1==t2);
//new String("Tiger") == new String("Tiger"); false
        System.out.println("=================================================================");
       // example

        String c1 = "Cybertek"; // oblect is created in string pool
        String c2 = new String("Cybetek");// created in heap.
        String c3 = new String("Cybetek");// created in heap.
        String c4 = "Cybertek";// string pool
        String c5 = "cybertek"; // string pool since case-sensetve



        System.out.println(c1==c2);//false
        // "Cybertek" == new String ("Cybertek:);

        System.out.println( c2==c3);// fasle
        // new String ("Cybertek") == new String ("Cybertek")
        System.out.println("=================================================================");

  String str1 ="Java";
  str1 = "javascript";
        System.out.println(str1);

str1 = "Java";

        System.out.println(str1);


    }




}
