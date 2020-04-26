package Practice;

public class Task173_MethodsWithString8_Bigger {
    public static String biggerS(String a ,String b)
    {
        if (a.length() > b.length()){
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "orange";

        System.out.println(biggerS(str1, str2));
    }
}
