package day24_Methods;

import java.util.Scanner;

public class WarmUps {
    public static void main(String[] args) {
        int a = 100000;
        int b = 20;

        Max(a,b);

        Calculation(10,20,'*');
        Calculation(30,40,'+');

        int n1 = 10000;
        int n2 = 100;

        Calculation(n1,n2,'/');
        Palindrome("Anna");
    }

    public static void Max(int num1, int num2) {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scan.nextInt();
        System.out.println("Enter second number");
        int num2 = scan.nextInt();

         */
        if(num1>num2) {
            System.out.println("Maximum number is: "+num1);
        } else {
            System.out.println("Maximum number is: "+num2);
        }
    }
    public static void Calculation(double num1, double num2, char opertaor){
        switch (opertaor){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Invalid entry");
        }
    }
    public static void Palindrome (String str){
        str = str.toLowerCase();
        String reverse = "";
        for (int i = str.length()-1; i>=0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(str.equals(reverse));
    }
}
