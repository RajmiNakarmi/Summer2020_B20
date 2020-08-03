package day13_Scanner;

import java.util.Scanner;

public class extline_vs_nextmethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter your salary:");
        double salary = scan.nextDouble();

        scan.nextLine();// ww use this to take out enter that are left in thr scanner. so that we can use next line

        System.out.println("enter your full name:");
        String fullname = scan.nextLine();

        //scan.nextLine();

        System.out.println("salary: "+salary);
        System.out.println("full name:" + fullname);
    }
}
