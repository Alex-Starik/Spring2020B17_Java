package Practice;

import java.util.Scanner;

public class Factorial_Loop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long a = (long) n;
        // long a = 0l;
        for (long i = a - 1; i > 0; i--) {
            a =  a * i;

        }

        System.out.println(a);


    }
}
