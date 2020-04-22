package Practice;

public class Task167_MethodsWithString2_RemoveDuplicates {
    public static void main(String[] args) {
        //test your code
        System.out.println( uniqueChars("spoon") ) ;
    }

    public static String uniqueChars(String str) {
        //TODO: write your below
        //char [] ch = str.toCharArray();

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(""+str.charAt(i))) {
            result += str.charAt(i);
            }
        }
        return result;
    }
}
