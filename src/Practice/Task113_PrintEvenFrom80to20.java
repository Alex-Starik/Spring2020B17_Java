package Practice;

public class Task113_PrintEvenFrom80to20 {
    public static void main(String[] args) {
        int [] nums = new int [61];

        int i = 80;
        for(int a = 0; a<=60; a++){

            nums [a] = i--;

        }

        for (int each : nums) {
            if(each % 2 == 0) {
                System.out.print(each+ " ");
            }
        }
    }
}
