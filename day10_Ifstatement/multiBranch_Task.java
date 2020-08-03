package day10_Ifstatement;

import day05_ArithmeticOperators.EmployeeInfo;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class multiBranch_Task {


    public static void main(String[] args) {
        int score = 70;

        //90 t0 100 == A, 80 to 89 ==B, 70 to 79 ==C, 60 to 69 == D, otherwise ==F, 0  to 59 =

        if (score >= 90 && score <= 100) {
            System.out.println("Grade is A"); //int score = 70;
        } else if (score >= 80 && score <= 89) {
            System.out.println("Grade is B");

        } else if (score >= 70 && score <= 79) {
            System.out.println("Grade is C");

        } else if (score >= 60 && score <= 69) {
            System.out.println("Grade is D");

        } else {
            System.out.println("D");

        }

        System.out.println("==================================================");



        String grade = "";


        if (score >= 90 && score <= 100) {
            grade ="A";
        } else if (score >= 80 && score <= 89) {
            grade ="B";
        } else if (score >= 70 && score <= 79) {
            grade ="C";

        } else if (score >= 60 && score <= 69) {
            grade ="D";

        } else {
            grade ="F";

        }




    }






}