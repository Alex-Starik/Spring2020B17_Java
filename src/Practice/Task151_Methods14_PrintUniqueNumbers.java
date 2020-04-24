package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Task151_Methods14_PrintUniqueNumbers {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            int[] nums = new int[size];
            for(int i=0; i < size; i++){
                nums[i] = scan.nextInt();
            }
            printUniqueNumbers(nums);
        }

        public static void printUniqueNumbers(int[] nums){
            //WRITE YOUR CODE HERE
           /* int [] arr = new int [nums.length];

            for (int i = 0; i < arr.length-1; i++) {
                for (int j = 1; j < arr.length; j++) {
                    if (nums[i] != nums[j]) {
                        System.out.println(nums[i]);
                    }
                }
            }

            */

           /* Arrays.sort(nums);
            for (int i = 0; i < nums.length-1; i++) {
                if (nums[i] != nums [i+1]) {
                    System.out.println(nums[i]);
                }
            }

            */

           String result = "";
           for (int i = 0; i < nums.length; i++) {
               int count = 0;
               for (int j = 0; j < nums.length; j++) {
                   if (nums [i] == nums [j]) {
                       count++;
                   }

               }
               if (count == 1) {
                   System.out.println(nums [i]);
               }
           }
            // System.out.println(result);
        }
}
