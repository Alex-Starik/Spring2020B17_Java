package day19_Arrays;
/*
write a program that can return the unique characters from a string
		Ex:  "AABCC" ==> "B"
 */
public class Uniques {
    public static void main(String[] args) {
        String str = "AABCCDFFK";

        String result = ""; // "B"

        for(int j = 0; j <= str.length()-1; j++){
            int count = 0;

            for (int i = 0; i <= str.length()-1; i++) {
                if (str.charAt(i) == str.charAt(j)) { // check how many time the character is occurred in the string
                    count++;
                }
            }

            if (count==1) { // if the character at index j is unique - will be concated to the result
                result+=str.charAt(j);
            }
        }


        System.out.println(result);
    }
}
