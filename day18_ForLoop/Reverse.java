package day18_ForLoop;
import java.util.Scanner;
public class Reverse {
    /*
    5. write a program that can reverse the following string:
                String str = "Java";
                output: avaJ
            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt method

     */
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String str = scan.next();
        // avaJ ==> ava , J

        String s1 = str.substring(1);  //"ava"

        String s2 = str.substring(0,1 ); //"J"

        // char ch1 = str.charAt(0);

        String result1 = s1+s2; // "avaJ"

        System.out.println(result1);

        // programming  ==> gnimmargorp


    }

}
