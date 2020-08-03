package day18_ForLoop;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

/*
 write a program that will return the domain of an email address:
            Ex:
                input: test@gmail.com
                output: the domain of the email is: gmail
                inputL: Cybertek@yahoo.com
                output: the domain of the email is: yahoo
 */
public class EmailDomain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = "rajminakarmi@gmail.com";
        int index1 = email.indexOf("@");
        //System.out.println(index1);
        int index2 = email.lastIndexOf(".");

       String domain = email.substring(index1+1,index2);
        System.out.println(domain);

        //System.out.println(domain.replace("gmail");
    }
}
