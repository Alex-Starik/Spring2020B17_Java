package Practice;

public class Task_AlterArray {
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5};
        mystery(a);
        for(int e : a)
        {
            System.out.print(e + " ");
        }
        // should print out 10 1 30 2 50
    }
    public static void mystery(int[] array)
    {
        for ( int each : array) {
            if (each % 2 == 0) {
                each /= 2;
            } else {
                each *= 10;
            }
        }


        /* for ( int i = 0; i < array.length; i++ ) {
            if (array [i] % 2 == 0) {
                array [i] = array [i] / 2;
            } else {
                array [i] = array [i] * 10;
            }
        }

         */
    }
}
