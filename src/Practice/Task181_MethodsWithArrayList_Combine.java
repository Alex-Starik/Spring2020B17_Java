package Practice;

import java.util.ArrayList;

public class Task181_MethodsWithArrayList_Combine {
    public static String combineRs(String[] r1,String[] r2)
    {
        ArrayList<String> list = new ArrayList<>();

        for ( String each : r1) {
            list.add(each);
        }
        for ( String each : r2) {
            list.add(each);
        }

        String result = "";

        for ( String each : list) {
            result += each;
        }
        return result;
    }
}
