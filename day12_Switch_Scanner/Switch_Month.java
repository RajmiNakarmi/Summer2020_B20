package day12_Switch_Scanner;

public class Switch_Month {
    /*write program that cab print out the month based on the number
    ex:
    1
    output : jan

    DO NOT USE IF and Ternary
     */
    public static void main(String[] args) {

        int num = 6;
        String result = " ";

        switch (num){

            case 1:
                result = "January";
                break;

            case 2:
                result = "Februry";
                break;

            case 3:
                result = "March";
                break;

            case 4:
                result = "April";
                break;

            case 5:
                result = "May";
                break;

            case 6:
                result = "June";
                break;

            case 7:
                result = "July";
                break;

            case 8:
                result = "August";
                break;

            case 9:
                result = "September";
                break;

            case 10:
                result = "October";
                break;

            case 11:
                result = "November";
                break;

            case 12:
                result = "December";
                break;

            default:
                result ="OPPS!";



        }
        System.out.println(result);
    }
}
