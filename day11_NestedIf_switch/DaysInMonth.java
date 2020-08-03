package day11_NestedIf_switch;

public class DaysInMonth {
    /*2. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         HINT:
                28 days: 2
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12
*/
    public static void main(String[] args) {
        int month = 13;

        boolean days28 = month == 2; // for the month that has 28days.
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11; // for the month that has 30days
        boolean invalid =  month <1 || month > 12;
       // days29 == fasle && days30 == false && invalid ==fasle
        String result = "";

        if (days28){
            result = "28days";

        }else  if (days30){
            result = "30days";

        }else if(invalid){
            result ="invalid";

        }else{ //  this else statemet crreat if all above boolean are false
            result = "31days";
                    //0r
        }

        System.out.println(result);
    }


}
