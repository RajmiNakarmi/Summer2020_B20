package day33_Calculate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Times {
    public static void main(String[] args) {
        LocalTime currentTime =     LocalTime.of(20, 45,55);
        System.out.println(currentTime);

        LocalTime t2 = LocalTime.now();
        System.out.println(t2);


        LocalDateTime t3 = LocalDateTime.of(2020,07,25,15,25);
        System.out.println(t3);

        // to call current exact time and date

        LocalDateTime t4 = LocalDateTime.now();
        System.out.println(t4);
    }
}
