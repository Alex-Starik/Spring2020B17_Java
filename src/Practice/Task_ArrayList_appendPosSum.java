package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_ArrayList_appendPosSum {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(4,-6,3,-8,0,4,3));

        System.out.println(appendPosSum(list));
    }
    //create your method below
    public static ArrayList<Integer> appendPosSum (ArrayList<Integer> list) {

        ArrayList<Integer> list2 = new ArrayList<>();
        for (Integer each : list) {
            if (each > 0) {
                list2.add(each);
            }
        }
        Integer lastNum = 0;
        for (Integer each : list2) {
            lastNum += each;
        }
        list2.add(lastNum);
        return list2;
    }
}
