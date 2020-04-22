package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_Next_Line {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // 13 + Enter

        System.out.println("Enter some number:");
        int num = input.nextInt();
        System.out.println(num);

        input.nextLine(); // used for taking out the "Enter"

        System.out.println("Enter your name:");
        String name = input.nextLine(); // 13

        System.out.println(name);
    }

}
