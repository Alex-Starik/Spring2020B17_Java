package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));

        int max = Collections.max(list);
        System.out.println(max);

        int min = Collections.min(list);
        System.out.println(min);
        System.out.println("====================================");
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,7,8));
        Integer minNum = Collections.min(list2); // 1
        list2.removeAll(Arrays.asList(minNum));
        System.out.println(list2);

        int secondMin = Collections.min(list2);
        System.out.println(secondMin);

        System.out.println("======================================");

        ArrayList<Integer> list3 = new ArrayList<>();
            list3. addAll(Arrays.asList(1,2,3,4,5));

            Collections.swap(list3, 0, 4);

        System.out.println(list3);

        System.out.println("===============================");
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Omer", "Omer", "Mary", "Sha", "Fatih", "Omer"));

        Collections.replaceAll(names, "Omar", "Irina");

        System.out.println(names);


    }
}
