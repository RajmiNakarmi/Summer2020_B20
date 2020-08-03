package day04_variables;

public class CarInfo {


    /*
    create a class called CarInfo
    Year
    Brand
    Model
    Mileage
    Price

    Print the into of the car
    Ex:
    2020
    BMW
    X5
    30000
    45000
    OUTPUT:
    2020 BMW X5, 3000 miles, $45000
     */

    public static void main(String[] args) {
        int Year= 2020;
        String Brand="BMW";
        String model ="X5";
        int mileage = 30000;
        double price = 45000;
        System.out.println(Year+" "+Brand+ " "+ model+","+mileage +"miles, $" + price);


    }
    }

