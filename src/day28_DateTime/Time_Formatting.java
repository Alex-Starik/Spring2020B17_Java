package day28_DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Formatting {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.of(11, 30);

        System.out.println(time1);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println(time1.format(dtf));

        LocalTime time2 = LocalTime.of(12, 01);

        boolean result1 = time1.isAfter(time2);
        System.out.println(result1);
    }
}
