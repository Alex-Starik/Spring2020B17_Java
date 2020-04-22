package Practice;

import java.util.Scanner;

public class Task_104_Arrays55_Loop_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        // int count = 0;

        for (int i =0; i<4; i++) {
            if(nums[i] == 5) {
                //count++;
                if(nums[i]==nums[i+1]) {
                    System.out.println("true");
                    System.exit(0);
                }
            }
        }
        System.out.println("false");
    }
}
