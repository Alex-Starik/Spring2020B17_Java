package Practice;

//import java.util.Collections;

import java.util.Arrays;

public class Task_findTheMissingNumbers {
    public static void main(String[] args) {

    }

    public static int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int z = i + 1;
            if (arr[i] != z) {
                return z;
            }
        }
        return 10;
    }
}
