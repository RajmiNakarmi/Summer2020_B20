package day09_IfStatement;

public class maximun {
    public static void main(String[] args) {

/*  1. write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)

 */
        double a = 600;
        double b = 1200;
        double c = 300;

        double max =0; //<== local variable //we want to assign  the maximum nunber or variable max, this variable can be reuse

        // using with boolean variable
        boolean aIsMax = a > b && a > c;
        //             500>200 && 500>1000
        //              true && false ==>false

        boolean bIsMax = b > a && b > c;// aIsMax == false && b > c; (<== another condition)
        //               2

        boolean cIsMax = c > a && c >b; // aIsMax == false && bIsMax == false; or  aIsMax && bIsMax == false; or
        //!aIsMax && !bIsMax ==> !(aIsMax && bIsMax)

        if (aIsMax){
            //System.out.println(a);
            max = a;
        }
        if (bIsMax){
           // System.out.println(b);
            max = b;
        }
        if(cIsMax){
            //System.out.println(c);
            max = c;
        }

        System.out.println(max);
    }
}