package day11_NestedIf_switch;

public class DaysInMonth2 {

    public static void main(String[] args) {
        int month = 12;
        boolean validnumber = month >= 1 && month <= 12;

        boolean days28 = month == 2; // for the month that has 28days.
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11; // for the month that has 30days

        String result = "";

        if (validnumber) {// for 28days, 30days and 31 days

            if (days28) {
                result = "28Days";

            } else if (days30) {
                result = "30Days";
            } else {
                result = "31 Days";
            }


        }else{//invalid months
            result = "Invalid";
        }

        System.out.println(result);
        }
    }
