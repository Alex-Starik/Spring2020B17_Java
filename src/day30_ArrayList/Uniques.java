package day30_ArrayList;

import java.util.ArrayList;

/*
3. write a program that can print out the unique elements from an int array
		   HINT: store all the unqie elemenbts of array into a list of integers
		   Ex: array==> {1,1,2,3,3,4,5}
		   	   output: {2,4,5}
 */
public class Uniques {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // {1,2,1}
        list.add(1);
        list.add(2);
        list.add(1);

        ArrayList<Integer> unique = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            // list.get(0) ==> 1
            int count = 0;
            for (Integer eacah : list) {
                if (eacah == list.get(i)) {
                    count++;
                }
            }
            if (count == 1) {
                unique.add(list.get(i));
            }
        }
        System.out.println(list);
        System.out.println(unique);
    }
}
