package Practice;

import java.util.Arrays;

public class Task195_MethodsWithString15_Anagram {
    public static boolean isAnagram(String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        char [] arr1 = new char [word1.length()];
        char [] arr2 = new char [word2.length()];

        arr1 = word1.toCharArray();
        arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int count = 0;
        if (arr1.length == arr2.length) {

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i]) {
                    count++;
                }
            }
        }

        if(count == arr1.length) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "Listen";

        System.out.println(isAnagram(str1, str2));
    }
}
