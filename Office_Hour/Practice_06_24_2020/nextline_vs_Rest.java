package Office_Hour.Practice_06_24_2020;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class nextline_vs_Rest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age?");
        int age = input.nextInt();

        input.nextLine();
        System.out.println("Enter your full name");
        String fullName= input.nextLine();
       // input.nextLine();

    }
}
