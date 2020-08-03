package Office_Hour.Practice_06_24_2020;

import java.util.Scanner;

public class shippingInfo {
    /*
     write a program for the shipping info that, the program should ask:
                    building number
                    Street address (Assume it has more than one word)
                    city name
                    state name
                    zip code
                    full name of the person:
            and prints the ship to info in the following format:
            ex output:
                    Ship To:  Jimmy joe
                              7925 Jones Branch Dr
                              MCLean, VA 22102

     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your shipping address");


        System.out.print("Building Number: ");
        int buildingNum = scan.nextInt();
        System.out.println(buildingNum);

        scan.nextLine();
        System.out.print("Street Address: ");
        String streetAddress = scan.nextLine();
        System.out.println(streetAddress);
       // scan.nextLine();

        System.out.print("City Name: ");
        String cityName =scan.next();
        System.out.println(cityName);

       // scan.nextLine();

        System.out.print("State: ");
        String State = scan.next();
        System.out.println(State);

        System.out.print("Zip Code: ");
        int ZipCode = scan.nextInt();
        System.out.println(ZipCode);

        scan.nextLine();
        System.out.print("Full Name: ");
        String fullName = scan.nextLine();
        System.out.println(fullName);

        System.out.println("Ship To : " +'\t' + fullName +'\n' +'\t' +'\t'+'\t' + buildingNum + " " +  streetAddress +'\n'+'\t' +'\t'+'\t'+ cityName +" "+State + " "+ZipCode );

  scan.close();
    }

}
