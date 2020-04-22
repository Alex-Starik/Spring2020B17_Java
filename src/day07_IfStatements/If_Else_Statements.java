package day07_IfStatements;

public class If_Else_Statements {
    public static void main(String[] args) {

      /*  int number = 0;

        if (number >=0){
            System.out.println(number + " is positive");
        }

        if (number <0) {
            System.out.println(number + " is negative");
        }

        if (number >=0){
            System.out.println(number + " is positive");
        } else {
            System.out.println(number + " is negative");
        }

       */

      int number = 100;

      if (number % 2 == 0) {
          System.out.println(number + " is even number");
      }

      if (number % 2 != 0) {
          System.out.println(number + " is odd number");
      }

      if(number % 2 == 0){
          System.out.println(number + " is even number");
      }
      else { // otherwise
          System.out.println(number + " is odd number");
      }

      int age = 19;
      if (age >= 21) {
          System.out.println("Here is your Vodka");
      } else {
          System.out.println("Go home kid");
      }

      boolean testedPositiveForCorona = true;

        if (testedPositiveForCorona) {
            System.out.println("Buy more toilet papers and stay home");
        } else {
            System.out.println("Do more coding");
        }

    }
}
