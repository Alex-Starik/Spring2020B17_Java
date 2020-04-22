package Practice;

public class Task161_MethodsWithReturns6_Water {
    public static double waterTax(double units)
    {
        double bill = 0.0;

        //your code here
        if (units <= 50) {
            bill = units * 0.6;
        } else if (units > 50 && units < 100) {
            bill = units * 0.9;
        } else if ( units > 100 && units < 150) {
            bill = units * 0.9 + 50.0;
        } else if ( units > 150) {
            bill = units * 0.9 + 100;

        }

        //end your code here


        return bill;
    }//end waterTax

    public static void main(String[] args) {
        double units1 = 151;
        double result = waterTax(units1);

        System.out.println(result);
    }
}
