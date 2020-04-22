package day20_ArraysContinue;

import java.util.Arrays;

public class String_Methods {
    public static void main(String[] args) {

        String name = "Sanek Star";

        char ch[] = name.toCharArray();

        System.out.println(Arrays.toString(ch));

        String str1 = "Cybertek School".toLowerCase();
        String str2 = "School Cybertek".toLowerCase();

        char[] ch1 = str1.toCharArray(); // [C, y, b, e, r, t, e, k,  , S, c, h, o, o, l]
        char[] ch2 = str2.toCharArray(); // [S, c, h, o, o, l,  , C, y, b, e, r, t, e, k]

        /* System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

         */

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean equalStr = Arrays.equals(ch1, ch2);

        System.out.println(equalStr);

    }
}
