package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {
        Predicate<Integer> oddNumber = x -> x % 2 != 0;

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.removeIf(oddNumber);

        System.out.println(list);

        System.out.println("=======================================");

        Predicate<Integer>lessThan5 = Y -> Y < 5;

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(lessThan5);

        System.out.println(list2);

        System.out.println("=======================================");

        Predicate<String> startsWithM = s -> s.toLowerCase().startsWith("m");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Murtaza", "Moddemed", "Boris", "Sha", "Bilal"));

        names.removeIf(startsWithM);

        System.out.println(names);
    }
}
