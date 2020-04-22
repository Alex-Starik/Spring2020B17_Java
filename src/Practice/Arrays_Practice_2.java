package Practice;

import java.util.Arrays;

public class Arrays_Practice_2 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {4, 5, 6, 7};

        int arr3[] = new int[arr1.length + arr2.length];

        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr3[count] = arr1[i];
            count++;
        }
        for(int i = 0; i < arr2.length; i++) {
            arr3[count] = arr2[i];
            count++;
        }



        System.out.println(Arrays.toString(arr3));
    }
}
