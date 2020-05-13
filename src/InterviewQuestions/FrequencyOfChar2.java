package InterviewQuestions;

public class FrequencyOfChar2 {

    public static void main(String[] args) {
        String str = "AAABBCDD";
        System.out.println(FrequencyOfChar(str));
    }

    public static String FrequencyOfChar (String str){
        String expectedRes = "";

        int j = 0;
        while (j < str.length()) {
            int count = 0;
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            expectedRes += str.charAt(j)+""+count;
            str = str.replace(""+str.charAt(j), "");
        }
        return expectedRes;
    }
}
