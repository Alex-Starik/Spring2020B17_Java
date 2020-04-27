package Practice;

import java.util.Arrays;

public class TaskAssessment4_IsSorted {
    public static boolean isSort(int[] nums)
    {
        int [] arr1 = new int [nums.length];

        for (int i = nums.length-1; i >=0; i--) {

            arr1 [i] = nums [i];

        }
        Arrays.sort(arr1);

        int count = 0;
        for (int i = nums.length-1; i >=0; i--) {

            if(arr1 [i] == nums [i]){
                count++;
            }
        }

        if(count==nums.length) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {2,3,5,4,9};
        System.out.println(isSort(arr));
    }
}
