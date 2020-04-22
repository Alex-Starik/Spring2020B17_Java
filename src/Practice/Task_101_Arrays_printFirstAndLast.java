package Practice;

import java.util.Scanner;

public class Task_101_Arrays_printFirstAndLast {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        for (int i = 0; i <5; i++) {
            String twoLetters = "" + words[i].charAt(0) + words[i].charAt(words[i].length() - 1);
            System.out.println(twoLetters);
        }
    }
}
