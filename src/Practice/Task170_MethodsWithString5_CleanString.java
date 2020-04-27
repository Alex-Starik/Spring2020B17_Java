package Practice;

public class Task170_MethodsWithString5_CleanString {
    public static String clean (String text ,String badWord) {


        text = text.replaceAll(badWord, "");
        return text;


    }

    public static void main(String[] args) {
        String str = "he said bla bla bla";
        String str1 = "bla";

        System.out.println(clean(str, str1));
    }
}
