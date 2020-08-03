package day08_LogicalOperators;



public class practice4 {
    public static void main(String[] args) {


        int age = 116;

        // TRUE => Can buy alcoholic drink
        // FALSE => Can NOT buy alcoholic drink
        boolean result = age >=21;

        // if (result == true)
        if ( result ) {
            System.out.println("You can buy alcohol. RESULT:" + result);
        } else {
            System.out.println("You cannot buy alcohol. RESULT:" + result);
        }

    }
}