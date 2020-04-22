package day25_MethodsRecap;

import Resources.Library;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AABBCC"; // A2B2C2
        String NonDup = Library.RemoveDuplicates(str); // ABC

        String result = "";
        for (int i = 0; i < NonDup.length(); i++) {
            String ch = ""+NonDup.charAt(i); // "A"
            int num = Library.Frequency(str, ch);

            //System.out.print(ch+num);
            result += ch+num;
        }
        System.out.println(result);

        String str3 = "MMMMMMMJJJJJJJJIIIIIIIIUUUUUUUUYYYYYYYYY";

        String result4 = Library.FrequencyOfChars(str3);
        System.out.println(result4);

    }

    public static String FrequencyOfChars(String str) {
        String NonDup = Library.RemoveDuplicates(str); // ABC

        String result = "";
        for (int i = 0; i < NonDup.length(); i++) {
            String ch = ""+NonDup.charAt(i); // "A"
            int num = Library.Frequency(str, ch);

            //System.out.print(ch+num);
            result += ch+num;
        }

        return result;
    }




}
