package day16_ForLoop;

import java.util.Scanner;

public class Palindrome_Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words");
        String word = input.nextLine(); // Java
                                        // 0123
        String reverseWord = "";

        for(int i=word.length()-1; i >=0; i--){
            reverseWord += word.charAt(i);
        }

        System.out.println(reverseWord);

        boolean palindrome = word.equalsIgnoreCase(reverseWord);
        System.out.println(palindrome);
    }
}
