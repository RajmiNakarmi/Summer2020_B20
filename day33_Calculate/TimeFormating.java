package day33_Calculate;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormating {
    public static void main(String[] args) {

        //TO Format datetime
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy EEEE");
        LocalDate ld = LocalDate.of(2020,7,25);

        System.out.println(ld);
        System.out.println(  ld.format(dateFormat));

        /*
        hours : hh
        minutes : mm
        seconds: ss
        am/pm : a
         */

        // to print am/pm format
      DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern(" hh:mm:s a");
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(timeFormat));


        // May/20/19 Dayname 4:30 pm
        DateTimeFormatter DTFormat = DateTimeFormatter.ofPattern("MMM/dd/yy EEEE hh:mm a");
        LocalDateTime time1 = LocalDateTime.of(2019, 5, 20,16,30);
        System.out.println(time1);
        System.out.println(time1.format(DTFormat));

        System.out.println(  LocalDateTime.now().format(DTFormat)  );
        //Saturday 4:34pm
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");
        LocalDateTime Now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(Now.format(dtf));
    }
}
