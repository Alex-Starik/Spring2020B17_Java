package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task_Arrays_Diving {
    public static void main(String[] args) {
        //WRITE YOUR CODES HERE

        ArrayList<Float> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 7; i++){
            System.out.println("Enter score for judge "+(i+1)+":");
            list.add(scan.nextFloat());
        }
        System.out.println("Enter difficulty:");
        Float difficulty = scan.nextFloat();

        list.remove(Collections.max(list));
        list.remove(Collections.min(list));

        Float sum = 0f;
        for (Float each : list){
            sum += each;
        }
        Float total = sum * difficulty * 0.6f;
        System.out.println(total);



        // FINAL OUTPUT
        // System.out.printf("Total: %.2f", total);
    }
}
