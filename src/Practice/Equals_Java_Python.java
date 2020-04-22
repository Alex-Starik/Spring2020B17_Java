package Practice;

import java.util.Scanner;

public class Equals_Java_Python {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int countJava = 0;
        int countpython = 0;

        //sentence = sentence.toLowerCase();

        while (sentence.contains("java") || sentence.contains("python")) {
            while (sentence.contains("java")) {
                countJava++;
                sentence = sentence.replaceFirst("java", "");
            }
            while (sentence.contains("python")) {

                sentence = sentence.replace("python", "");
                countpython+=2;
            }
        }

        System.out.println(sentence);
        System.out.println(countJava);
        System.out.println(countpython);


        String result = "";
        if (countJava == countpython) {
            result = "true";
        } else {
            result = "false";
        }

        System.out.println(result);
    }
}
