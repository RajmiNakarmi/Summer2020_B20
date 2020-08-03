package Office_Hour.Practice_06_17_2020;

public class NestedIf {
    public static void main(String[] args) {

        int score = 44;
        char grade = 'A';

        if (score >= 0 && score <= 100) { //pre condition
            if (score >= 90 && score <= 100) {
                grade = 'A';
            } else if (score >= 80 && score <= 90) {
                grade = 'B';
            } else if (score >= 70 && score <= 80) {
                grade = 'C';

            } else if (score >= 60 && score <= 70) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            }  else{
                grade = 'I';
            }
                System.out.println(grade);
            }
        }


