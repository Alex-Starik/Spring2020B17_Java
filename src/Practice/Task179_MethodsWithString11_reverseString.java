package Practice;

public class Task179_MethodsWithString11_reverseString {
    public static String reverse(String input)
    {
        String reverseStr = "";
        for (int i = input.length()-1; i >= 0; i--){
            reverseStr += input.charAt(i);
        }
        return reverseStr;
    }

    public static void main(String[] args) {
        String str = "Sanek";

        System.out.println(reverse(str));
    }
}
