package day19_Arrays;

import java.util.Scanner;

public class Arrays_Practice {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println(arr.length); // 3

        int[] arr2 = new int[5];

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        String[] testers = new String[3]; // {"Reem", "Medina", "Osman"}

        testers[0] = "Reem";
        testers[1] = "Osman";

        System.out.println(testers[0]);
        System.out.println(testers[1]);
        System.out.println(testers[2]);

        System.out.println("==============================");
        // write a program that asks user "enter a name" 10 times, and store each names in the array students
        String[] students = new String[10];
        Scanner scan = new Scanner(System.in);
        students[0] = scan.next();

    }
}
