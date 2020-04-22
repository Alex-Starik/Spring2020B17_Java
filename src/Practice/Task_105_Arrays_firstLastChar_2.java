package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Task_105_Arrays_firstLastChar_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        String[]newWords = new String [5];

        for(int i=0; i<5; i++) {
            newWords[i] = "" + words[i].charAt(0) + words[i].charAt(words[i].length() - 1);
        }

        System.out.println(Arrays.toString(newWords));
    }
}
