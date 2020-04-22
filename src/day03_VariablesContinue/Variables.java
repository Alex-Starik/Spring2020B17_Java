package day03_VariablesContinue;

import netscape.javascript.JSUtil;

public class Variables {
    public static void main(String[] args) {
        boolean result1 = true;
        boolean result2 = false;

        boolean result3 = 87 + 2 > 10;
        System.out.println(result3);

        System.out.println( 9 >= 8); // true
        System.out.println( 10 != 11); //true
        System.out.println( "Muhtar" == "Good Guy"); // totally false
        System.out.println( "9" == "3"); // false
        System.out.println( true != false); // true
        //System.out.println( 9 = 9);
        // = opertaor is only used for assigning values to variable


        char ch1 = 'A';
        System.out.println(ch1);
        char ch2 = '1';
        System.out.println(ch2);
        char ch3 = 100;
        System.out.println(ch3);

        char ch4 = 30000;
        System.out.println(ch4);

        char character1 = 'a'; // number is 97
        //short s1 = character1;

        int num1 = character1;
        System.out.println(num1); // 97

        int total = 'a' + 'b';
        // 97 + 98 = 195
        System.out.println(total);

        char hgf = 97;
        System.out.println(hgf);

        int latter = 'Ы';
        System.out.println(latter);
    }
}
