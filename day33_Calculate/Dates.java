package day33_Calculate;

import com.sun.org.apache.regexp.internal.RESyntaxException;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDate;
import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {

        LocalDate DOB = LocalDate.of(1980,11,14);
        //year-month -date -- this is default pattren

        System.out.println(DOB);

      LocalDate today = LocalDate.now();
        System.out.println(today);

        //eg ; give leap year

        LocalDate y = LocalDate.of(2019,1, 1);
        boolean result = y.isLeapYear();
        System.out.println(result);

        //using Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = scan.nextInt();

        boolean result2 = LocalDate.of(year, 1,1). isLeapYear();
        System.out.println(result2);

        System.out.println("==========================================");
        System.out.println("Enter birth year, birth month, birth day");
       LocalDate d = LocalDate.of(scan.nextInt(), scan.nextInt(),scan.nextInt());
        System.out.println(d);
        System.out.println(d.isLeapYear());

    }
}
