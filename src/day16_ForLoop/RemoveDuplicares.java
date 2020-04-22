package day16_ForLoop;

public class RemoveDuplicares {
    public static void main(String[] args) {
        String str = "CCDDjjdghgksgjgkhskgffk"; //
        String result = ""; // we store the expected result in this variable

        for(int i =0; i<=str.length()-1; i++) {
         /*   if (!result.contains(""+str.charAt(i)))
            result += str.charAt(i);
        }

          */
            if (result.contains("" + str.charAt(i))) {
                continue;
            }
            result += str.charAt(i);
        }
        System.out.println(result);
    }
}
