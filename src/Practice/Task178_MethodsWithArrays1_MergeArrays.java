package Practice;

import java.util.Arrays;

public class Task178_MethodsWithArrays1_MergeArrays {
    public static int[] mergR(int[] a,int[] b) {
    int [] arr = new int [a.length + b.length];

    int z = 0;

    for (int i = 0; i < a.length; i++) {
        arr[z] = a[i];
        z++;
    }
        for (int i = 0; i < b.length; i++) {
            arr[z] = b[i];
            z++;
        }
        return arr;

    }//end mergR

    public static void main(String[] args)
    {
        int [] arr1 = {1,2,3};
        int [] arr2 = {4,5,6};

        System.out.println(Arrays.toString(mergR(arr1, arr2)));
    }
}
