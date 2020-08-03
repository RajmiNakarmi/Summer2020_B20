package Warmup_Task;

public class Equality_Task {
    /* write a program that can check the equality of the three given numberrs
    declare 3 numbers n1, n2, n3
            if n1 and n2 are equal and not equal to n3  => n1&n2 are equal
            if n2 and n3 are equal and not equal to n1==> n2&n3 are equal
            if n3 and n1 are qual and not equal to n2 ==>n3&n1 are equal
            if all equal ==> all equal
            if none of them are euqal ==> none of them are equal
            */
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 2;
        int n3 = 2;

        String equal = "";

        boolean equality = n1 == n2 && n1 != n3; // 1=2 & 3
        boolean equality1 = n2 == n3 && n2 != n1; // 2=3 & 1
        boolean equality2 = n3 == n1 && n3 != n2; //3=1 & 2

        if (equality == equality1) {
            equal = "all equal";

        } else if (equality1 = equality2) {
            equal = "all equal";

        } else {
            equal = "non of them are equal";
        }
        System.out.println(equal);
    }
}