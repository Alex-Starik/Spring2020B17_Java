package day25_MethodsRecap;
import Practice.WarmUp_Evening_4_19;
import Resources.Library;

public class Test {


    public static void main(String[] args) {
        String str = "ABCDABABABABABABABA";
        // String result = Practice.WarmUp_Evening_4_19.RemoveDuplicates(str);
        String result = Library.RemoveDuplicates(str);
        System.out.println(result);

        String str1 = "AABBCDEB";
        String str2 = "B";

        int num1 = Library.Frequency(str1, str2);

        System.out.println(num1);
    }
}