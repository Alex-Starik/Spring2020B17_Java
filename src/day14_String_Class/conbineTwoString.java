package day14_String_Class;

import java.util.Scanner;

/*
Ask user to enter two words. Print the first word, second word, second word, first word
			Input:
				one
				two
			Output:
				onetwotwoone
					DO NOT USE + OPERATOR
 */
public class conbineTwoString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word:");
        String firstWord = input.next();
        System.out.println("Enter second word:");
        String secondWord = input.next();

        String result = firstWord.concat(" "+secondWord).concat(" "+secondWord).concat(" "+firstWord);
        System.out.println(result);
    }
}
