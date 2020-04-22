package Practice;

public class Task169_MethodsWithString4 {
    public static int wordCount(String words) {
        int count = 0;
    if (words.contains(" ")) {
        String str [] = words.split(" ");
        count = str.length;
        } else {
        count = 1;
    }
      return count;
    }

    public static void main(String[] args) {
        String str1 = "one two three";
        int count1 = wordCount(str1);
        System.out.println(count1);
    }
}
