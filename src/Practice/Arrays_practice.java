package Practice;

import java.util.Scanner;

public class Arrays_practice {
    public static void main(String[] args) {
        // write a program that asks user "enter a name" 10 times, and store each names in the array students
        String[] students = new String[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ten names of your students:");

        System.out.println("Enter first name");
        students[0] = scan.next();

        System.out.println("Enter second name");
        students[1] = scan.next();

        System.out.println("Enter third name");
        students[2] = scan.next();

        System.out.println("Enter fourth name");
        students[3] = scan.next();

        System.out.println("Enter fifth name");
        students[4] = scan.next();

        System.out.println("Enter sixth name");
        students[5] = scan.next();

        System.out.println("Enter seventh name");
        students[6] = scan.next();

        System.out.println("Enter eighth name");
        students[7] = scan.next();

        System.out.println("Enter ninth name");
        students[8] = scan.next();

        System.out.println("Enter tenth name");
        students[9] = scan.next();

        System.out.println(students[2]);
    }
}
