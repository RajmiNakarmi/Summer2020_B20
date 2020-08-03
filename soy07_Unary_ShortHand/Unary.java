package soy07_Unary_ShortHand;

public class Unary {
    public static void main(String[] args) {

    int a= 20;
    ++a; // increment by 1 ++
        System.out.println(a);

        int b = 20;
        --b;// instead of doing b-10/20-1(-- for decrement

        System.out.println(b);


        /* examaple of pre and post increment and decrement

         */

        //pre:
       // ++ a, --b

        int x = 100;
        System.out.println(++x);//101
        System.out.println(--x);//99


        //post: a++; a--;
        //first pass the current value to increase or decrease depend on operator we give

        int  y= 99;
        System.out.println(y++);
        System.out.println(y--);


    }

}
