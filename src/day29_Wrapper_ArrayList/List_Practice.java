package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {
        ArrayList<String> grocceryList = new ArrayList<>();
        grocceryList.add("Milk");
        grocceryList.add("Coffee");
        grocceryList.add("Bread");
        grocceryList.add("Toilet Paper");
        grocceryList.add("Eggs");


        System.out.println(grocceryList);


        for (int i = 0; i < grocceryList.size(); i++) {
            System.out.println(grocceryList.get(i));
        }

        System.out.println("==============================");

        for (String each : grocceryList) {
            System.out.println(each);
        }

        // size():

        int size = grocceryList.size();
        System.out.println(size);

        int lastIndex = grocceryList.size()-1;
        System.out.println(lastIndex);
    }
}
