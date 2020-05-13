package InterviewQuestions;
/*
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2


 */
public class FrequencyOfChar {
    public static void main(String[] args) {


        String str = "AAABBCDD";
        String NonDup = ""; // ABCD

        for (int i = 0; i < str.length(); i++) {
            if (!NonDup.contains(""+str.charAt(i))){
                NonDup += str.charAt(i);
            }
        }
        String result = "";
        for (int i = 0; i < NonDup.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (NonDup.charAt(i)==str.charAt(j)) {
                    count++;
                }
            }
            result = result + NonDup.charAt(i)+count;
        }

        System.out.println(result);
    }

}
