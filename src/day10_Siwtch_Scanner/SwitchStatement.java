package day10_Siwtch_Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        byte a = 4;

        float a1 = 4.5f;
        long a2 = 10l;
        double a3 = 2.5d;
        boolean a4 = true;

        switch (4) {
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            default:
                System.out.println("Invalid case");
                break;
        }
    }
}
