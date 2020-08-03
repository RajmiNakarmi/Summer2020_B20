package day11_NestedIf_switch;

public class NestedIf_practice2 {

    /*
            precondition: minimum salary of 30k
                sub condition: minimum 2 years of job history
            1 monday
            2 Tuesday
            3 Wednesday
            ...
            7 Sunday
            invalid ==> there is no such a day
         */
    public static void main(String[] args) {


        int day = 9;
        String result1 = "";

      //  boolean validnumber = day >= 1 && day <= 7;

       // if (validnumber) {
if(day>= 1 && day <= 7){

            if (day == 1) {
                result1 = "Monday";
            } else if (day == 2) {
                result1 = "Tuesday";
            } else if (day == 3) {
                result1 = "Wednesday";
            } else if (day == 4) {
                result1 = "Thursady";
            } else if (day == 5) {
                result1 = "Friday";
            } else if (day == 6) {
                result1 = "Saturday";
            } else{
                result1 = "Saunday";
            }


        } else {
            result1 = "no such day";

        }
        System.out.println(result1);

// apply ternary
      /*  result1 = (day == 1)? "Monday" : (day == 2)? "Tuesay" : (day == 3) ? "Wednesday"
                : (day ==4)? "Thursady" : (day == 5) ? "Friday" :(day== 6) ? "Saturday"
            : "Sunday";

        System.out.println(result1);*/

    }
}