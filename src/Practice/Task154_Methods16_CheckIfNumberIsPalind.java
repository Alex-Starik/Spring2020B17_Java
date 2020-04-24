package Practice;

import java.util.Scanner;

public class Task154_Methods16_CheckIfNumberIsPalind {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        String num1 = ""+num;
        String num2 = "";

        for (int i = num1.length()-1; i >= 0; i--){
            num2 += num1.charAt(i);
        }

               if (num1.equals(num2)) {
            System.out.println(2 == 2);
        } else {
            System.out.println(2 != 2);
        }

    }
}
