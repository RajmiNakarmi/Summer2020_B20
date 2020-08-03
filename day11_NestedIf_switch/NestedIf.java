package day11_NestedIf_switch;

public class NestedIf {
    /*
    90- 100> A
     */
    public static void main(String[] args) {
        int score = 100;
        String result = "";

        if (score >= 0 && score <= 100) {// represet vaild score

            if (score >= 90 && score <= 100) {
                result = "A";
            } else if (score >= 80 && score <= 90) {
                result = "B";
            } else if (score >= 70 && score <= 80) {// no need to put && score<=
                result = "C";
            } else if (score >= 60 && score <= 70) {
                result = "D";
            } else {
                result = "F";
            }
        } else {
            result = "invalid";
        }

        System.out.println(result);



    }
}
