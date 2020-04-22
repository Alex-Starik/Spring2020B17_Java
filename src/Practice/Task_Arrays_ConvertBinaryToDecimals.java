package Practice;

import java.util.Scanner;

public class Task_Arrays_ConvertBinaryToDecimals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] binary = new int[8];
        for(int i =0; i < binary.length; i++) {
            binary[i] = input.nextInt();
        }

         // TODO: Write your code below.
        int total = 0;
        int j = 128;
        for(int i =0; i < binary.length; i++) {
            if (binary[i] > 0) {
                total+=j;
            }
            j/=2;
        }
        System.out.println(total);
    }
}
