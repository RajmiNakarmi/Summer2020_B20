package day21_loops;

import com.sun.org.apache.xerces.internal.util.XMLInputSourceAdaptor;

/*
 3. write a program that can divide two numbers without using / & % operators and retuns the devision and remainder
            ex:
                input:  10
                        3
                0utput: 3 with a remainder of 1
                numerator - denometer =
                10-3= 7
                7 - 3 = 4
                4 - 3 = 1
 */
public class DivideTwoNumbers {

    public static void main(String[] args) {
        int a = 60;
        int b = 2;

        int count = 0;

        while(a >= b){
            a-=b;
            count ++;
        }
        System.out.println(count + " with the remainder of "+ a);
    }
}
