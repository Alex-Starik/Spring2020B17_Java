package day22_Arrays_Loops;

public class Java_Python {
    public static void main(String[] args) {
        String sentence = "I like java and javascript";
        int countJava = 0; // 2
        int countPython = 0;
        String[] words = sentence.split(" "); // [I, like, java, and, javascript]

        for (String each : words) {
            if(each.contains("java")){
                countJava++;
            }
            if(each.contains("python")) {
                countPython++;
            }
        }
        System.out.println(countJava == countPython); // false
    }
}
