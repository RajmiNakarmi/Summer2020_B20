package day11_NestedIf_switch;

public class Switch_Practice2 {
    public static void main(String[] args) {

        String productName = "iphone";

        switch (productName){

            case"Galaxy":
                System.out.println("Samsung");
                break;
            case "ipod":
            case "iphone":
            case "Macbook":
                System.out.println("Apple");
                break;


        }
    }
}
