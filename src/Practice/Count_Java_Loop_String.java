package Practice;

import java.util.Scanner;

public class Count_Java_Loop_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int count = 0;
        while (word.contains("java")) {
            count++;
            word = word.replaceFirst("java", "anyWord");
        }

        System.out.println(count);
    }
}
