package Warmup_Task;
/*
 1. write a program that asks the user enter his car info:
                            brand
                            model
                            year
                            color
                            mileage
                            price
                ex: output format should be:
                      2012 Toyota Corolla white, 120000 miles, 12000 dollars

 */

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class carModel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your car info");

        System.out.println("Brand");
        String brand = scan.next();
        System.out.println(brand);

        System.out.println("model of the car");
        String model = scan.next();
        System.out.println(model);

        System.out.println("year of the car");
        int year = scan.nextInt();
        System.out.println(year);

        System.out.println("color of the car");
        String color = scan.next();
        System.out.println(color);

        System.out.println("Mileage");
        int mileage = scan.nextInt();
        System.out.println(mileage);

        System.out.println("Price");
        int price = scan.nextInt();
        System.out.println(price);

        System.out.println(year+ " " + brand +" "+ model+" "+ color+", "+ mileage +"miles" +", " + price+ "dollors");
    }


}

