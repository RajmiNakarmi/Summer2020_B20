package day13_Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Scanner_nextline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name");
       String fullname = scan.nextLine();
     // String studentName = scan.next();

        System.out.println("Enter your company name");
        String CompanyName = scan.nextLine();

        System.out.println("FullName:" +fullname);
        System.out.println("company name:" + CompanyName);

        scan.close();
    }
}
