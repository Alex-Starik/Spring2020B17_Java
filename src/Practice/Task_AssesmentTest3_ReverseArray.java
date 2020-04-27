package Practice;

import java.util.Arrays;

public class Task_AssesmentTest3_ReverseArray {
    public static void main(String[] args) {
        String arr [] = {"apple", "pear", "some", "body"};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    /**
     * Reverses the order of the elements in the specified array
     * @param arr
     * @return array of strings
     */
    public static String[] reverse(String[] arr) {
        String [] arr1 = new String [arr.length];
        /*
        arr1 [0] = arr [3]
        arr1 [1] = arr [2]
        arr1 [2] = arr [1]
        arr1 [3] = arr [0]
         */
        int z = 0;
        for (int i = arr.length-1; i >=0; i--) {

            arr1 [z] = arr [i];
            z++;
        }

        arr = arr1;

        return arr;
    }
}
