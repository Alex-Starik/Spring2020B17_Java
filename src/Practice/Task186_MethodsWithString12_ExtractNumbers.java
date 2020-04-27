package Practice;

public class Task186_MethodsWithString12_ExtractNumbers {
    public static String extractNum(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                result += s.charAt(i);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        String str = "aa!!%$#.10aa";
        System.out.println(extractNum(str));
    }
}
