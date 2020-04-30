package Practice;

import java.util.ArrayList;

public class Task190_MethodsWithArraylist11_AppendPosSum {
    public static void main(String[] args)
    {

    }
    public static ArrayList<Integer> appendPosSum (ArrayList<Integer> list){
        ArrayList<Integer> list2 = new ArrayList<>();

        for (Integer each : list) {
            if (each > 0) {
                list2.add(each);
            }
        }

        Integer sum = 0;
        for (Integer each : list2) {
            sum += each;
        }
        list2.add(sum);
        return list2;
    }
}
