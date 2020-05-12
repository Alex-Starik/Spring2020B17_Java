package Practice;

import java.util.Arrays;

public class Task_Combine_to_fullName {
    public static String[] combineNames(String[] first_names, String[] last_names)
    {
        String res1 = first_names[0]+" "+last_names[0];
        String res2 = first_names[1]+" "+last_names[1];

        String [] result = {res1, res2};
        return result;
    }

    public static void main(String[] args)
    {
        //feel free to test code here
        String [] first_names = {"bob", "joe"};
        String [] last_names = {"jones", "smith"};

        System.out.println(Arrays.toString(combineNames(first_names, last_names)));
    }
}
