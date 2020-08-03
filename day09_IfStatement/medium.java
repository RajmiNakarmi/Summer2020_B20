package day09_IfStatement;

public class medium {
    /*
    3. write a java program that accepts three numbers and rteurn the mediam number
                (assume that none of them are equal)
     */
    public static void main(String[] args) {
         double a =100;
         double b= 200;
         double c =150;

        boolean aIsMed = (a >b  && a < c) || (a > c && a < b);
        boolean bIsMed = (b > a && b < c )|| (b < c && b > a);
        boolean cIsMed = !aIsMed && !bIsMed;

         double med = 0;

        if (aIsMed){
            med = a;
        }
        if(bIsMed){
            med = b;
         }
        if (cIsMed){
            med = c;
        }
        System.out.println(med);
    }
}
