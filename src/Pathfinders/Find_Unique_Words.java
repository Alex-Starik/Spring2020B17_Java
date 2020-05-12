package Pathfinders;

import java.util.Scanner;

/*
Complete a void method printUniqueWords() that will print only unique words from an array of strings. Every single unique word should be printed from the new line.

[java, code, python, code, rust, code, rust]
 */
public class Find_Unique_Words {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }
    public static void printUniqueWords(String[] words){
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j =0; j < words.length; j++) {
                if (words[i].equals(words[j])){
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(words[i]);
            }
        }
    }
}
