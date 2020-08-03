package day09_IfStatement;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class bedTime_Task {
    /*
    1. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
Write a program that declares three integers as angles and check whether a triangle
is valid or not.

        Note: MUST use if&else statement

     */
    public static void main(String[] args) {


        double angle1 = 60.9;
        double angle2 = 40.69;
        double angle3 = 30.00;

        double allAngles = angle1 + angle2 + angle3;

        if (allAngles == 180) {
            System.out.println("Traingle is Valid");
        } else {
            System.out.println("Not Valid");
        }

        System.out.println("=====================================================================================");
/*
2. write a program that can check if the two characters (chars) are same characters
            if same, print: "Same characters"
            otherwise, print: "Different characters"
 */
        char a = 'A';
        char b = 'B';

        if (a == b) {
            System.out.println("Same charactes");

        } else {
            System.out.println("differnt character");
        }

        System.out.println("====================================================================================");
        /*
        3. SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017.
        wirte a program that can check if the vehicle is eligible to recall.
        if eligible, print: true
        otherwise: false
         */

        int year = 2004;
        boolean model = (year >= 1995 && year <= 1998) || (year >= 2001 && year <= 2002) || (year >= 2004 && year <= 2006) ||
                (year >= 2015 && year <= 2017);
        if (model) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}


