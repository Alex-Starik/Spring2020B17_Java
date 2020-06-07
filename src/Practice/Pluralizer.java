package Practice;

import java.util.Scanner;

public class Pluralizer {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("# in:");
        int amt = inp.nextInt();
        inp.nextLine(); //this line is necessary
        System.out.print("word:");
        String word = inp.nextLine();
        //leave the above unedited, write your code below:
        if (amt != 1){
            if (word.substring(word.length()-2).equals("fe")){
                word = word.substring(0, word.length()-2) + "ves";
            } else if (word.substring(word.length()-2).equals("sh") || word.substring(word.length()-2).equals("ch")) {
                word = word + "es";
            } else if (word.substring(word.length()-2).equals("us")){
                word = word.substring(0, word.length()-2) + "i";
            }else if (word.substring(word.length()-2).equals("ay") || word.substring(word.length()-2).equals("oy") || word.substring(word.length()-2).equals("ey") || word.substring(word.length()-2).equals("uy")) {
                word = word + "s";
            } else if (word.substring(word.length()-1).equals("y")) {
                word = word.substring(0, word.length()-1) + "ies";
            } else {
                word = word + "s";
            }
            System.out.println(amt+" "+word);
        } else {
            System.out.println(amt+" "+word);
        }

    }
}
