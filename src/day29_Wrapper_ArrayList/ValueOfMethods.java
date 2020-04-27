package day29_Wrapper_ArrayList;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;

public class ValueOfMethods {
    public static void main(String[] args) {
        String str = "123";

        Integer a = Integer.valueOf(str); // Integer, 123

        System.out.println(a);

        /*byte c = 10;
        Integer b = c;
         */

        double b = Integer.valueOf(str); // unboxing
        // double = Integer

        System.out.println(b);


        String str2 = "15.5";

        double d1 = Double.parseDouble(str2);
        // double = double  // none

        double d2 = Double.valueOf(str2);
        // double = Double  // unboxing

        System.out.println(d1); // 15.5
        System.out.println(d2); // 15.5

        System.out.println(d1 == d2);
        System.out.println("====================================================");

        int z1 = 2000;
        // Long L1 = z1; // does not accept any other primitives except for long

        String r1 = "true";
        Boolean t1 = Boolean.valueOf(r1); // Boolean, true

        boolean t2 = Boolean.valueOf(r1); // Boolean, true
        // boolean = Boolean // unboxing

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("=====================================");
        int maxNum = Integer.MAX_VALUE;

        System.out.println(maxNum);

        double maxNum2 = Double.MAX_VALUE;

        System.out.println(maxNum2);


        int minNum = Integer.MIN_VALUE;
        System.out.println(minNum);

        byte maxNum3 = Byte.MAX_VALUE; // 127
        System.out.println(maxNum3);

        byte minNum3 = Byte.MIN_VALUE; // -128
        System.out.println(minNum3);

        System.out.println("======================================");

        int [] arr = new int [3];
        System.out.println(Arrays.toString(arr));

        Boolean [] arr2 = new Boolean[3];
        System.out.println(Arrays.toString(arr2));

    }
}
