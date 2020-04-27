package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {
        // ArrayList<DataType> listName = new ArrayList<DataType>();

        ArrayList<Integer> scores = new ArrayList<Integer>(); // size: 0
                                    // add five elements, size: 5
                                    // remove two elements, size: 3

        scores.add(10); // autoboxing    size: 1
        scores.add(20); // autoboxing    size: 2
        scores.add(30); // autoboxing    size: 2

        System.out.println(scores);

        Integer num = scores.get(2); // none
        int num1 = scores.get(2); // unboxing
        double num2 = scores.get(2); // unboxing

        System.out.println(num2);
    }
}
