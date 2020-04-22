package day10_Siwtch_Scanner;
import java.util.Scanner;
public class rateCalculator_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        int salary = scan.nextInt();

        System.out.println("How many hours do you work per week?");
        byte weeklyHours = scan.nextByte();

        System.out.println("How many weeks do you work in a year?");
        byte numberOfWeeks = scan.nextByte();

        // hourlyRate = (salary / numberOfWeeks) / weeklyHours

        int hourlyRate = (salary / numberOfWeeks) / weeklyHours;
        System.out.println("Your hourly rate is: $" + hourlyRate);
    }
}
