package day06_CompatisonOperations;

public class Swap2 {

        /*task03:
            create a class called Swap, and write a program that can swap two variables' values wihtout using temporary variable
                    Ex:
                        int a =10;
                        int b= 15;
                    output:
                        System.out.println(a); ===> 15
                        System.out.println(b); ===> 10
     */

    public static void main(String[] args) {
        int a= 10;
        int b= 15;


        a= a+b; //  a= 10+15 =25
        b= a-b; // b = a-b; 25-15 = 10
        a= a-b;//a = a-b, 25-10 = 15

        System.out.println("a="+ a);
        System.out.println("b="+ b);




    }

}
