package day12_JavaRecap;

import java.util.Scanner;

/*
1. ask salary
2. full name
3. company name
4. SSN
5. JobTitle
 */
public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();

        input.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter Company Name: ");
        String companyName = input.nextLine();

        System.out.println("Enter your SSN: ");
        long SSN = input.nextLong();

        input.nextLine();

        System.out.println("Enter the Job title: ");
        String jobTitle = input.nextLine();

        System.out.println("Full name is: "+ fullName);
        System.out.println("Job Title is: "+ jobTitle);
        System.out.println("Company Name is: "+ companyName);
        System.out.println("SSN is: "+SSN);
        System.out.println("Your salary is: $"+salary);

    }
}
