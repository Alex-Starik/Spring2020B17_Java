package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Task_114_Arrays_FindNonDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        Arrays.sort(nums);

        if (nums[0]!=nums[1]) {
            System.out.println(nums[0]);
        } else if (nums[2]!=nums[3]){
            System.out.println(nums[2]);
        } else  if (nums[4]!=nums[5]){
            System.out.println(nums[4]);
        } else {
            System.out.println(nums[6]);
        }

    }
}
