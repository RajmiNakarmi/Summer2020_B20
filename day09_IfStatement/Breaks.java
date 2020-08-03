package day09_IfStatement;

public class Breaks {

    public static void main(String[] args) {
        String itsbreaktime = "yes";

        if (itsbreaktime == "yes") {
            System.out.println("Take 15mins of break");


        }
        else {
            System.out.println("continue the class ");
        }

        System.out.println("============================================================");

        int a = 300;
        int b = 1200;

        if (a > b){
            System.out.println( a +" is greater");
        }else {
            System.out.println(b + " is greater ");
        }
    }
}
