package day05_Unary_ShorthandOperators;

public class LeapYear {

    public static void main(String[] args) {

        short year = 2056;

        // leapYear: year % 4 == 0;
            // if returns true ==> LeapYear, if it returns false ==> not LeapYear

        boolean leapYear = year % 4 == 0; // if the year can be devided by 4 without any reminder, then its leap year

        // System.out.println( year + " is leap year: " + leapYear);

        String result = year + " is leap year: " + leapYear;
        System.out.println(result);


    }
}
