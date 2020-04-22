package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_Next_Line_Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 7921 JonesBranch Dr, McLean VA, 22034
        // fullAddress:

        System.out.println("Builder number: ");
        int Bnumber = input.nextInt();
        System.out.println("Building number is: "+Bnumber);

        input.nextLine(); // used for taking out the Enter from Scanner

        System.out.println("Street: ");
        String street = input.nextLine();
        System.out.println("Street: "+street);

        System.out.println("Enter the ZIP code: ");
        int zipCode = input.nextInt(); // 22034 + Enter

        input.nextLine(); // used for taking out the Enter from Scanner

        System.out.println("Enter the city name and state separeted by comma and space: ");
        String cityState = input.nextLine();

        String fullAddress = Bnumber+ " "+ street+", "+cityState+" "+zipCode;
        System.out.println(fullAddress);

        input.close(); // closes the scanner
    }
}
