package day06_Shorthnd_LogicalOperators;

public class SingleIfStatement {

    public static void main(String[] args) {
        boolean coronaDetected = true;

        if (coronaDetected) {
            System.out.println("Buy more toilet papers");
            System.out.println("But more water");
            System.out.println("Stay at home");
            System.out.println("Do more java coding");
        }

        System.out.println("==============================");
        int a = 201;
        boolean evenNumber = a % 2 == 0; // if a number can be divided by 2 without the remainder
        // boolean oddNumber = a % 2 != 0; // if the number cannot be divided by 2 evenly

            if (evenNumber) {
                System.out.println(a + " is even number");
            }
        if (!evenNumber) { // if the number is not even number, then it must be odd
            System.out.println(a + " is odd number");
        }

    }
}
