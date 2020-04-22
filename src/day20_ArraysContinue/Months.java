package day20_ArraysContinue;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        /*String[] months2 = new String[12];
                months2[0] = "Jan";

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        int attempts = 1;

        while (num>12 || num<=0) {
            System.out.println("Invalid entry!");
            System.out.println("Please re-enter the number");
            num = input.nextInt();
            attempts++;

            if(attempts == 3 && (num>12 || num<=0)){
                System.out.println("It was a last attempt, sorry");
                System.exit(0);
            }
        }

        String result = months[num-1];
        // if(num==1) {
            // result = months[num-1];
        System.out.println(result);


    }
}
