public class warmUptasks {

    public static void main(String[] args) {
/*  1. write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)

 */
        int a = 10;
        int b = 20;
        int c = 30;


        if (a > b && a > c) {
            System.out.println(a + "is maximum");
        }
        else if (b > a && b > c) {
            System.out.println(b + "is maximum");
        }
        else if (c > a && c > b) {
            System.out.println(c + " is maximum");
        }
    }
}