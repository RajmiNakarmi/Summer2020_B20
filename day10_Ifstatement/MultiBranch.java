package day10_Ifstatement;

public class MultiBranch {
    public static void main(String[] args) {
        int number = -180;

        if (number >= 0) {
            System.out.println(number + " is postive");
        }
        if (number <= 0) {
            System.out.println(number + " is postive");
        }
        if (number == 0) {
            System.out.println(number + " is zer");
            System.out.println("====================================================");

            //multi Branch if

            if (number > 0) {
                System.out.println(number + " is positve");

            } else if (number < 0) {
                System.out.println(number + " is negative");
            } else {
                System.out.println(number + " is zero");
            }
        }
    }
}
