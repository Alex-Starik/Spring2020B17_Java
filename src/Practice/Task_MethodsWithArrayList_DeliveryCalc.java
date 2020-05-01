package Practice;

import java.util.ArrayList;

public class Task_MethodsWithArrayList_DeliveryCalc {
    public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel)
    {
        int result = 0;
        Integer sum = 0;

        for (Integer each : deliveries) {
            sum += each;
        }
        if (sum % max_fuel != 0) {
            result = sum / max_fuel + 1;
        } else {
            result = sum / max_fuel;
        }
        return result;

    }

    public static void main(String[] args)
    {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(6);
        int times = refuel_times(arr,3);
        System.out.print(times);//should output 5


    }//end main
}
