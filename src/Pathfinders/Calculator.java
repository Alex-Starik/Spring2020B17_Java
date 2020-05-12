package Pathfinders;

import java.util.Scanner;

/*
create a static method called "plus", its return is void and it gets no arguments.

It asks the user to input two numbers, then it will add them and print the result.
Create a scanner within plus method.

 */
public class Calculator {
    public static void main(String[] args) {
        plus();
    }


    public static void plus () {
        Scanner scan = new Scanner (System.in);
        System.out.println("enter first number:");
        int num1 = scan.nextInt();
        System.out.println("enter second number:");
        int num2 = scan.nextInt();

        int sum = num1 + num2;
        System.out.println("result: "+sum);
    }
}
