package Warmup_Task;

public class Task2_dayOfMonths {
    /* write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
        ex:
            month = 3
        output:
            31 days
            month = 4
        output:
            30 days
            month = 13
        output:
            Invalid month

        HINT:
            28 days: 2
            30 days: 4,6,9,11
            31 days: 1,3,5,7,8,10,12
*/
    public static void main(String[] args) {
    int month = 34;
String result = "";

    boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;
    boolean days31 = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
    boolean days28 = month == 2;

    if (days31) {
        result = " Have 31 days";

        }else if(days30){
        result = " Have 30 days";

    }else if(days28) {
        result = " Only 28 day";

    }else{
        result =" opps! where are you from?";

    }
        System.out.println(result);

}
    }

