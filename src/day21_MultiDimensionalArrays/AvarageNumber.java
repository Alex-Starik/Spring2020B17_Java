package day21_MultiDimensionalArrays;

import java.text.DecimalFormat;

/*
write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10
 */
public class AvarageNumber {
    public static void main(String[] args) {

        DecimalFormat DF = new DecimalFormat("0.000");
        int [] arr = {14, 24, 38, 49, 58};
            // average: sum of all numbers / length;

        int length = arr.length; // total number of the elements
        int sum = 0;

        for(int i = 0; i < length; i++){
            sum+=arr[i];
        }

        double average = sum / (double)length;
        System.out.println(DF.format(average));
    }
}
