package Practice;
/*
write a program that asks the user first and last name, then prints the initials.

            ex.:
                input:
                    cybertek
                    school

                 output:
                    CS
 */
import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class String_manipulations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        String firstName = fullName.substring(0, 1).toUpperCase();
        String lastName = fullName.substring(fullName.indexOf(" ")+1);

        lastName = lastName.substring(0,1).toUpperCase();

        System.out.println("Your initials are: "+firstName+lastName);

    }
}
