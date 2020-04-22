package Practice;

import java.util.Scanner;

public class Cats_and_Dogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        while (word.contains("cat")) {
            countOfCats++;
            word = word.replaceFirst("cat", "anyWord");
        }
        while (word.contains("dog")) {
            countOfDogs++;
            word = word.replace("dog", "anyWord");
        }
        System.out.println(word);
        System.out.println(countOfCats);
        System.out.println(countOfDogs);

        String result = "";
        if (countOfCats == countOfDogs) {
            result = "true";
        } else {
            result = "false";
        }

        System.out.println(result);
    }
}
