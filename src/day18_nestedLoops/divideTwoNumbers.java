package day18_nestedLoops;
/*
1. write a program that can divide two numbers.
            NOTE: DO NOT USE division, multiplication, or module operators

            10 / 3 ==> 3 with a remainder of 1
 */
public class divideTwoNumbers {

    public static void main(String[] args) {

        int a = 20;
        int b = 0;
        int count = 0;

        if(b==0) {
            System.out.println("Error");
            System.exit(0);
        }

        while (a >= b) {
            a -= b;
            count++;
        }
        System.out.println("The result is: "+count);
        if (a>0) {
            System.out.println("Remainder is: "+a);
        }
    }
}
