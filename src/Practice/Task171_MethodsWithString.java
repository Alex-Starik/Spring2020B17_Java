package Practice;

public class Task171_MethodsWithString {
    public static String limit(String text, int maxLength)
    {
        String result = "";
        result = text.substring(0, maxLength);
        return result;
    }

    public static void main(String[] args) {

        String str = "bla bla";
        int num = 3;
        System.out.println(limit(str, num));
    }
}
