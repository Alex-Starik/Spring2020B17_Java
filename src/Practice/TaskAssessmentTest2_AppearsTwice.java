package Practice;

public class TaskAssessmentTest2_AppearsTwice {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String str1 = "laptop";
        String str2 = "I would like to buy a new laptop, because my laptop is too old.";

        System.out.println(appearsTwice(str1, str2));
    }

    /**
     * @param target - string that you need to check.
     * @param sentence - string where you need to lookup for target.
     * @return
     */
    public static boolean appearsTwice(String target, String sentence) {
        int count = 0;
        while (sentence.contains(target)){
            sentence = sentence.replaceFirst(target, "");
            count++;
        }
        if (count == 2) {
            return true;
        }
        return false;
    }
}
