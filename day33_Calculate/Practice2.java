package day33_Calculate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice2 {

    public static void main(String[] args) {

        String[] students = {"Paban", "Alla", "Conar", "Sarah", "Iman"};
        LocalDate[] birthDays = {
                LocalDate.of(1991, 11, 12),
                LocalDate.of(1987, 1, 10),
                LocalDate.of(1981, 11, 2),
                LocalDate.of(1979, 6, 7),
                LocalDate.of(1980, 7, 9)
        };
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMM/dd/yy EEE");



        for(int i =0; i <= students.length-1; i++){
            System.out.println(students[i]+" : "+ birthDays[i].format(dateFormat) );
        }


    }
    }

