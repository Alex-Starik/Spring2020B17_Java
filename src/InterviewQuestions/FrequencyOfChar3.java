package InterviewQuestions;

import com.sun.xml.internal.ws.resources.UtilMessages;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class FrequencyOfChar3 {
    public static void main(String[] args) {
        String str = "AAABBCDD";
        // String str = "BBVVFDAKK";
       System.out.println(FrequencyOfChar(str));
    }

    public static String FrequencyOfChar (String str){
        String b = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
        //return b;
        b = b.replace(",","").replace("[","").replace("]","");
        String result = "";
        for (int j = 0; j < b.length(); j++){
            int count = 0;
            for (int i = 0; i < str.length(); i++){
                if(str.substring(i, i+1).equals(""+str.charAt(j))){
                    // times++;
                }

            }
            result +=b.substring(j, j+1)+count;

        }
        return result;
    }


}
