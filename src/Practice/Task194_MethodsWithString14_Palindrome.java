package Practice;

public class Task194_MethodsWithString14_Palindrome {
    public static boolean isPalindrome(String check) {
        if (check.contains(" ")) {
            check = check.replace(" ", "");
        }

        String reverse = "";
        for (int i = check.length()-1; i >= 0; i--){
            reverse += check.charAt(i);
        }

        if(check.equalsIgnoreCase(reverse)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "Nurses Run";
        System.out.println(isPalindrome(str));
    }
}
