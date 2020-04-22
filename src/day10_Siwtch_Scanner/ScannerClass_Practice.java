package day10_Siwtch_Scanner;

import java.util.Scanner;

public class ScannerClass_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number");
                int num1 = input.nextInt();

        System.out.println("Enter your second number");
                int num2 = input.nextInt();

                int total = (num1 + num2);
        System.out.println("The sum of "+num1+ " and "+num2 + " is: "+ total);
    }
}
