package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplictes2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D", "D"));
        //System.out.println(list);

        ArrayList<String> result = new ArrayList<>();

        for (String each : list) {
            int count = Collections.frequency(list, each);
            if (count > 1) {
                if (result.contains(each)){
                    continue;
                }
                result.add(each);

            }
        }
        /*int count = Collections.frequency(list, list.get(0));
        if (count > 1) {
            result.add(list.get(0));

        }

         */
        System.out.println(result);
    }
}
