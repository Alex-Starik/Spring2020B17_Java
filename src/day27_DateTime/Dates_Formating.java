package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formating {
    public static void main(String[] args) {

        // day_month_year
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");

        LocalDate date1 = LocalDate.now(); // 2020-04-23

        System.out.println(date1.format(dtf));

        /*
        create a date called birthday: Month/Day/Year
        eX: 2020 04 23
            Apr/23/20
         */

        System.out.println("================================");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("EEEE MMM/dd/yy");

        LocalDate birthday = LocalDate.of(1987, 9, 12);

        String str1 = birthday.format(dtf1);
        System.out.println(str1);

        LocalDate dat3 = LocalDate.now();
        System.out.println(dat3);
    }
}
