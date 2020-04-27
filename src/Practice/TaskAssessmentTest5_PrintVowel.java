package Practice;

import java.util.Scanner;

public class TaskAssessmentTest5_PrintVowel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'e' || word.charAt(i) == 'u' || word.charAt(i) == 'i' || word.charAt(i) == 'o' ||
                    word.charAt(i) == 'a') {
                result += word.charAt(i);
            }
        }

        System.out.println(result);
    }
}
