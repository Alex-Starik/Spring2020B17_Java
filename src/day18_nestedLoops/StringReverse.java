package day18_nestedLoops;

public class StringReverse {

    public static void main(String[] args) {
        String str = "а роза упала на лапу азора";

        String reverse = "";

        int lastIndex = str.length()-1;

        do {
            reverse += str.charAt(lastIndex);

            lastIndex--;
        }while (lastIndex >= 0);

        System.out.println(reverse);
    }
}
