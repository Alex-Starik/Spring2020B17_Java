package day017_WhileLoops;

public class Frequency {

    public static void main(String[] args) {
        String str = "Java is fun, Java is cool";

        int count = 0; // 2
        while (str.contains("Java")) {
            count++;
            str= str.replaceFirst("Java", ""); // after counting the first "Java", we need to remove it from
        }

    }
}
