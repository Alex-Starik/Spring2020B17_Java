package day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        // list.remove(1);
        String str = "B";
        boolean r1 =list.remove(str);

        System.out.println(list);

        list.clear();
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        list2.add(2);
        list2.add(3);

        int num1 = list2.indexOf(1); // 0
            // Integer = int  // Autoboxing
        System.out.println(num1);

        int num2 = list2.indexOf(100); // -1
        System.out.println(num2);

        int num3 = list2.indexOf(3); // 3
        System.out.println(num3);


    }
}
