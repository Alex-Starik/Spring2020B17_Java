package day017_WhileLoops;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {
        /*
        ask the user to enter yes or no
            if the user enters other yes or no - repeat the previous step
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Yes or No");
        String word = input.next();

        boolean valid = word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no");
        while (!valid) {
            System.out.println("Please, re-enter");
            word = input.next();

            if(word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("no")){
                break;
            }
        }

        if(word.equalsIgnoreCase("yes")){
            System.out.println("Entered yes");
        }
        if(word.equalsIgnoreCase("no")){
            System.out.println("Entered no");
    }
}}
