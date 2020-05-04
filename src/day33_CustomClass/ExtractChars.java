package day33_CustomClass;

import java.util.ArrayList;

public class ExtractChars {
    public static void main(String[] args) {


    /*
        4. write a program that can extract the sepecial characters, digits and alphebets from a string and stores them into seperate ArrayLists of Character:
			ex:
				str = "ABCD123$%#@&456EFG!";
				list1: {$, %, #, @, &, !}
				list2: {A, B, C, D, E, F, G}
				list3: {1, 2, 3, 4, 5, 6}
         */

        String str = "ABCD123$%#@&456EFG!";
        char [] arr = str.toCharArray();

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> numbers = new ArrayList<>();
        ArrayList<Character> trash = new ArrayList<>();

        for (char each : arr) {
            if (Character.isLetter(each)) {
                letters.add(each);
            } else if (Character.isDigit(each)) {
                numbers.add(each);
            } else {
                trash.add(each);
            }
        }
        /*for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                numbers.add(str.charAt(i));
            } else if (str.charAt(i) > 64 && str.charAt(i) < 91) {
                letters.add(str.charAt(i));
            } else {
                trash.add(str.charAt(i));
            }
        }

         */
        System.out.println(letters);
        System.out.println(numbers);
        System.out.println(trash);
    }
}
