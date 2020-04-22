package day26_MethodOverLoading;

public class Uniques {

    public static void main(String[] args) {
        String str = "ABBCBBDB";

        String result = ""; // A

        for (int i = 0; i < str.length(); i++) {
            int num = Frequency(str, str.charAt(i));
            if (num==1) {
                result += str.charAt(i);
            }
        }
        //A
        System.out.println(result);

        String str2 = "Cybertek";
        String result2 = uniques(str2);

        System.out.println(result2);
    }

    public static String uniques(String str) {
        String result = ""; // A

        for (int i = 0; i < str.length(); i++) {
            int num = Frequency(str, str.charAt(i));
            if (num==1) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static int Frequency (String str, char ch) { // counts the ch` frequency
        char [] arr = str.toCharArray(); // [A, A, A]

        int count = 0;

        for (char each: arr) {
            if (ch == each) {
                count++;
            }
        }
        return count;
    }
}
