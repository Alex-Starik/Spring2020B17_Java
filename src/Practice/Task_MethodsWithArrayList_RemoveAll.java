package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_MethodsWithArrayList_RemoveAll {
    public static void removeAll (ArrayList<String> wordList, String targetword) {
        wordList.removeAll(Arrays.asList(targetword));
    }
}
