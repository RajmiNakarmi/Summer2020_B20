package Office_Hour.Practice_06_17_2020;
// multi Branch if else statement
//A,B,C,D
public class elseIf_practice {
    public static void main(String[] args) {


        int score = 0;

        char grade = ' ';

        if (score >= 90 && score <= 100) {
            grade = 'A';
            }else if (score >= 80 && score <= 90){
            grade ='B';
        }else if(score >= 70 && score <= 80){
            grade ='C';

        }else if(score >= 60 && score <= 70){
            grade = 'D';

        }else {
            grade = 'F';

            System.out.println(grade);
        }
        //Ternary

        char grade2 = (score>= 90 && score <= 100)? 'A' :(score >= 80 ) ? grade2 = 'B'
                : (score>= 70)? 'C' :(score >= 60 ) ? grade2 = 'D':'F';

        System.out.println(grade2);

    }
}