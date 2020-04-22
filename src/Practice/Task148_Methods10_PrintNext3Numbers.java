package Practice;

import java.util.Scanner;

public class Task148_Methods10_PrintNext3Numbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();
        next3(num);
    }

    public static void next3(int num1) {
        String result = "";
        for (int i = 0; i<3; i++) {
            if (i==2) {
                result = result+(num1+i+1)+"";
            } else {
                result = result+(num1 + i+1) + " ";
            }
        }

        System.out.println(result);
    }
}
