package Practice;

import java.util.Collections;
import java.util.Scanner;

public class Task_1TimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        int hours = 0;
        if (s.charAt(2)==':') {
            hours = Integer.parseInt(s.substring(0, 2));
            if (hours < 12 && s.charAt(s.length()-2)=='A') {
                System.out.println(s.substring(0, s.length()-2));
            }  else if (hours == 12 && s.charAt(s.length()-2)=='P') {
                System.out.println((hours-12) + s.substring(2, s.length()-2));
            } else if (s.charAt(s.length()-2)=='P') {
                System.out.println((hours+12) + s.substring(2, s.length()-2));
            }
        } else {
            hours = Integer.parseInt(s.substring(0, 1));
            if (hours < 12 && s.charAt(s.length()-2)=='A') {
                System.out.println(s.substring(0, s.length()-2));
            } else if (s.charAt(s.length()-2)=='P') {
                System.out.println((hours+12) + s.substring(1, s.length()-2));
            } else {
                System.out.println((hours-12) + s.substring(1, s.length()-2));
            }
        }




    }
}
