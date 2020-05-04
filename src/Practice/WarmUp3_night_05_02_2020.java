package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class WarmUp3_night_05_02_2020 {
    public static void main(String[] args) {
        /*
        1. create an ArrayList of string called country names
			2. write a program that can remove all the country names that have length of 10 or greater

         */

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Ukraine", "USA", "Gvatemalaruno", "Azerbaidjan", "Poland"));

        Predicate<String> more10 = z -> z.length() >= 10;
        list.removeIf(more10);

        System.out.println(list);
    }
}
