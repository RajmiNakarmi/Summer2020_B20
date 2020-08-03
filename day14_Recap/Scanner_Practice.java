package day14_Recap;

import org.omg.CORBA.WStringSeqHelper;

import java.util.Scanner;

public class Scanner_Practice {
    /*
    gender(next())
    age nextint
    country name(nextline)
    zip code = next int
    full name (nextline
    full company name(nextline
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your gender");
        String gender = input.next();

        System.out.println("Enter your age");
        int age = input.nextInt();

        input.nextLine();
        System.out.println("Enter your country name");
        String country = input.nextLine();

        System.out.println("Enter Zip code");
        int zipCode = input.nextInt();

        input.nextLine();
        System.out.println("Enter your fullName");
        String fullName = input.nextLine();

        System.out.println("Enter your companyName");
       String companyName = input.nextLine();


    }
}
