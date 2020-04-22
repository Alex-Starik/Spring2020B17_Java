package day11_Scanner;
/*
1. ask user enter first name
2. ask user to enter last name
3. ask user employeed or not? (true or false)
3. if he is employeed - ask user to enter salary
4. if he is not employeed - set the salsry to 0

output:
    full name:
    employeed status:
    salary:
 */
import java.util.Scanner;

public class Scanner_Practice1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.next();

        System.out.println("Enter your last name: ");
        String lastName = input.next();

        String fullName = firstName+ " "+ lastName;


        System.out.println("Are you employeed?");
        boolean employeementStatus = input.nextBoolean();

        double salary = 0;

        if (employeementStatus==true) {
            System.out.println("Enter your salary: ");
            salary = input.nextDouble();
        }

        System.out.println("Full name is: " + fullName);
        System.out.println("Employeed: " +employeementStatus);
        System.out.println("Salary is: $" + salary);
    }
}
