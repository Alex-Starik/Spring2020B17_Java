package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Party_Loop_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*int num = 0;
        String [] names = new String [num+1];

        System.out.println("Please enter guest name:");
        names [num] = input.next();

        System.out.println(Arrays.toString(names));

         */

        String result = "";
        System.out.println("Please enter guest name:");
        result = result + input.next();

        System.out.println("Do you want to enter new guest name:");
        String answer = input.next();

        while (answer.equalsIgnoreCase("yes")) {
            System.out.println("Please enter guest name:");
            result = result + ", "+input.next();
            System.out.println("Do you want to enter new guest name:");
            answer = input.next();
            if (answer.equalsIgnoreCase("no")) {
                break;
            }

        }




        System.out.println("Guest's list: "+result);



    }
}
