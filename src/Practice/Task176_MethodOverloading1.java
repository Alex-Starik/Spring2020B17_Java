package Practice;

public class Task176_MethodOverloading1 {
    public static void main(String[] args) {
        int arr [] = {1,4,8,6,3,5,-1,0,-9,23};

        System.out.println(findMax(arr));

    }
    public static int findMax (int [] num) {
        int max = num[0];
        for (int each : num) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
    public static double findMax (double [] num) {
        double max = num[0];
        for (double each : num) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
}
