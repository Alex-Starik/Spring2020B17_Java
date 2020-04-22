package Practice;

public class Task166_MethodsWithString1_merge {
    public static String mergeStrings(String one, String two) {

    String result = "";

        for (int i = 0; i < one.length() || i < two.length(); i++) {
            if (i < one.length()) {
                result += one.charAt(i);
            }

            if (i < two.length()) {
                result += two.charAt(i);
            }
        }



        return result;
    }

    public static void main(String[] args) {
        String one1 = "java";
        String two2 = "selenium";

        String result1 = mergeStrings(one1, two2);
        System.out.println(result1);
    }
}
