package Practice;

import java.util.Scanner;

public class Task158_MethodIsReturn3 {

    public static boolean isEven(int n){
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int num = scan.nextInt();
        System.out.println(isEven(num));
    }
}
