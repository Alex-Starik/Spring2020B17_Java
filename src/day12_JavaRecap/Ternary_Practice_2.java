package day12_JavaRecap;

import java.util.Scanner;

public class Ternary_Practice_2 {

    public static void main(String[] args) {

       /* Scanner scan = new Scanner(System.in);

        System.out.println("Enter a character: ");
        String char1 = scan.next();

        String result =

        */

       char ch1 = 'A';

       String result = (ch1 == 'A') ? "A id selected": (ch1 == 'B') ? "B is selected" : (ch1=='C') ? "C is selected"
               : (ch1 == 'D') ? "D is selected" : "Invalid Character";
    }
}
