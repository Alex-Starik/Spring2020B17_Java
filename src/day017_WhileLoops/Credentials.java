package day017_WhileLoops;

import java.util.Scanner;

public class Credentials {
/*
user: cybertek
pass: cybertek123
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter username");
        String username = input.next();

        System.out.println("Enter password");
        String password = input.next();

        int count = 1;
        while (!(username.equals("cybertek") && password.equals("cybertek123"))) {
            System.out.println("Please, re-enter your credentials");
            System.out.println("Enter username");
            username = input.next();

            System.out.println("Enter password");
            password = input.next();


            if(count==3) {
                System.out.println("Your account is locked");
                break;
            }
            count++;
        }
        if(username.equals("cybertek") && password.equals("cybertek123")) {
            System.out.println("Logged in");
        }
    }
}
