package Practice;

import java.util.Scanner;

public class Task155_Nethods17_FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int [] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233};
        System.out.println(arr[num]);


    }
}
