package day22_Arrays_Loops;

import java.util.Arrays;

public class Nested_ForEach {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        for(int each : arr) {
            System.out.println(each);
        }
        System.out.println("===============================");
        int[][] arr2D = { {1,2,3}, {4,5,6} };

        for(int[] each1Darray : arr2D) {
            for (int eachElement : each1Darray) {
                System.out.println(eachElement);
            }
        }
        System.out.println("===============================");

        char[][] ch2D = {{'A', 'B'}, {'C', 'D', 'E'}};

        for (char [] each1Darray : ch2D) {
            for( char each: each1Darray){
                System.out.println(each);
            }
        }
    }
}
