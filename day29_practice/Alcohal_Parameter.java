package day29_practice;

public class Alcohal_Parameter {
    public static void main(String[] args) {
eligibityToBuy(17);
    }

    public static void eligibityToBuy(int age){
        if(age<21){
            System.out.println("You are not eligible to buy");
            return;//forcefully return the method

        }
        System.out.println("You are  eligible to buy");
    }
}
