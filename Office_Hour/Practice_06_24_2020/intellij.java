package Office_Hour.Practice_06_24_2020;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class intellij {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter status code");

        int status = scan.nextInt();

       // String result = "";

        switch (status){

            case 200:
                System.out.println("ok");
                break;

            case 201:
               // result= "Created";
                System.out.println("Created");
                break;

            case 202:
                //result= "Accepted";
                System.out.println("Accepted");
                break;

            case 301:
                // = "Moved Permanently";
                System.out.println("Move Permanently");
                break;

            case 303:
               // result = "See other ";
                System.out.println("See other");
                break;

            case 304:
               // result = "Not Modified";
                System.out.println("Not Modified");
                break;

            case 307:
               // result= "Temporary Redirect";
                System.out.println("Temporary Redirect");
                break;

            case 400:
               // result = "Bad Result";
                System.out.println("Bad Result");
                break;

            case 401:
                //result = "Unathorized";
                System.out.println("Unathorized");
                break;

            case 403:
                //result = "Forbidden";
                System.out.println("Forbidden");
                break;

            case 404:
                //result = "Not Found";
                System.out.println("Not Found");
                break;

            case 410:
               // result = "Gone";
                System.out.println("Gone");
                break;

            case 500:
                //result = "Internal Server Error";
                System.out.println("Internal Server Error");
                break;

            case 503:
                System.out.println("Server Unavailable");
                break;


            default:
               // result = "Invalid status code";
                System.out.println("Invalid Status code!");
                break;






        }



    }
}


