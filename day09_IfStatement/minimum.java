package day09_IfStatement;

public class minimum {
    /* 2. write a java program that accepts three numbers and return the minimum number
                (assume that none of them are equal)
                     */
    public static void main(String[] args) {


        double a = 10;
        double b = 20;
        double c = 1;

        boolean aIsMin = a < b && a < c;
        boolean bIsMin = b < a && b < c;//or -> aIsMain == false && b < c; 0r !aIsMin
        boolean cIsMin = c < a && c < b;//or --> !bIsMin && !bIsMin; or--> aIsMain ==false && bIsMin == false
                                                                              //false &&  flase = false
        double min = 0; // to initialize number
 //local varial need to initialize before we use it

        if (aIsMin) {
            min =a;
        }

        if (bIsMin){
            min =b;
        }
        if(cIsMin)
            min =c;
        System.out.println(min + " is the minimum number");
    }
}


