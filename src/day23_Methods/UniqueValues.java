package day23_Methods;
/*
Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
 */
public class UniqueValues {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "A", "C"}; // B

        // solution1:
        for (String each3 : arr) {
            int count2 = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(each3)) {
                    count2++;
                }
            }
            if (count2 == 1) {
                System.out.println(each3);
            }
        }




        System.out.println("========================================");
        // solution2:
        for (String each2 : arr) {
            int count = 0;
            for (String each : arr) {
                if (each.equals(each2)) {
                    count++;
                }
            }
            //System.out.println(count);
            if (count == 1) { // if the character is unique
                System.out.println(each2);
            }
        }
    }
}
