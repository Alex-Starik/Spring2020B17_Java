package day22_Arrays_Loops;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        for (int i = arr.length-1; i>=0; i--) {
            int eachNum = arr[i];
            System.out.print(eachNum+" ");
        }
        System.out.println();
        System.out.println("===================================");
        //[5, 4, 3, 2, 1]

        int [] RevArr = new int [arr.length]; // [0,0,0,0,0]

        // RevArr[0] = arr[4];
        int j = arr.length-1;
        for (int i =0; i<arr.length; i++) {
            RevArr[i] = arr[j];
            j--;
        }
        System.out.println(Arrays.toString(RevArr));
    }
}
