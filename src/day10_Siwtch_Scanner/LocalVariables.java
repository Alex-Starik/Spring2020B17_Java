package day10_Siwtch_Scanner;

public class LocalVariables {

    public static void main(String[] args) {
// declare variable: DataType variableName;
        int a = 0;

        if (true) {
            System.out.println(a);
            int b = 10;
        }
        // System.out.println(b); local variables cannot be used outside the block

        switch (3) {
            case 1:
                int c = 100;

            case 2:
             //   System.out.println(c); // the local variable c belongs to the case block 1
        }
    }
}
