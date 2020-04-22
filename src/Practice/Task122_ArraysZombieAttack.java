package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Task122_ArraysZombieAttack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        System.out.println("Day 0 "+ Arrays.toString(inhabitants));

        for(int j=1; j<10; j++) {
            for (int i = 0; i < inhabitants.length; i++) {
                inhabitants[i] = inhabitants[i] / 2;
                if (inhabitants[0]==0 && inhabitants[1]==0 && inhabitants[2]==0 && inhabitants[3]==0 && inhabitants[4]==0 && inhabitants[5]==0 && inhabitants[6]==0 && inhabitants[7]==0) {
                    System.out.println("Day " + j +" " +Arrays.toString(inhabitants));
                    System.out.println("---- EXTINCT ----");
                    System.exit(0);

                }
            }
            System.out.println("Day " + j +" " +Arrays.toString(inhabitants));

        }



    }
}
