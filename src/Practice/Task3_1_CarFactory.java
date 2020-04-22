package Practice;

import java.util.Scanner;

public class Task3_1_CarFactory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String model = scan.next();
        int year = scan.nextInt();
        boolean recalled = false;


        boolean condition1 = model.equalsIgnoreCase("Extravagant") && (year>=2010 && year<=2012);
        boolean condition2 = model.equalsIgnoreCase("Guzzler") && (year>=2015 && year<=2018);

        if (condition1 || condition2) {
            System.out.println(!recalled);
        }
    }
}
