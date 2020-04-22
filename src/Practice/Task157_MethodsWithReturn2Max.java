package Practice;

import java.util.Scanner;

public class Task157_MethodsWithReturn2Max {
    public static int max(int x,int  y){
        if (x > y) {
            return y;
        } else{
            return x;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = max(num1,num2);
        System.out.println(result);
    }
}
