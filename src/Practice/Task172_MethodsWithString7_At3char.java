package Practice;

public class Task172_MethodsWithString7_At3char {
    public static String at3(String target,String word)
    {
        String result = "";

        result += target.substring(0, 3);
        result += word;
        result += target.substring(3);

        return result;
    }

    public static void main(String[] args) {
        String str1 = "longword";
        String str2 = "foo";

        System.out.println(at3(str1, str2));
    }
}
