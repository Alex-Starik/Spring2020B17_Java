package day14_String_Class;

import java.util.Scanner;

/*
Ask user to enter two words. Print first word without its first character then print the second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana
 */
public class combine_Two_String_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word:");
        String word1 = input.next(); // Apple
                word1=  word1.substring(1, word1.length()); // pple

        System.out.println("Enter second word:");
        String word2 = input.next();
                word2 = word2.substring(1,word1.length() );

        String result = word1+word2;

        System.out.println(result);

    }
}
