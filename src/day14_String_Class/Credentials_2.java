package day14_String_Class;

import java.util.Scanner;

public class Credentials_2 {

    public static void main(String[] args) {
        /*
        valid credentials are:
            username:cybertek
            password: cybertekschool

            precondition: username and password cannpt be empty
            if they are empty ==> please enter the credentials

         if user entered both valid username and password == > log in
         if valid password, invalid username ==> username is incorrect
         if valid user name, invalid password ==> password is incorrect
         if both password and username are invalid ==> invalid username snd password
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String inputUsername = input.nextLine();

        input.nextLine();
        System.out.println("Enter your password");
        String inputPassWord = input.nextLine();

        boolean logedIn = inputUsername.equals("Cybertek") && inputPassWord.equals("cybertekschool");
        boolean invalidUserName = !inputUsername.equals("Cybertek") && inputPassWord.equals("cybertekschool");
        boolean invalidPassword = inputUsername.equals("Cybertek") && !inputPassWord.equals("cybertekschool");

        if (!inputUsername.isEmpty() && !inputPassWord.isEmpty()) { // username and password are not empty
            if(logedIn) {
                System.out.println("Logged in");
            } else if (invalidUserName) {
                System.out.println("Username is incorrect");
            } else if(invalidPassword) {
                System.out.println("Password is incorrect");
            } else {
                System.out.println("Both username and password are incorrect");
            }


        } else { // username and password are empty
            System.out.println("Please enter the credentials");
        }
    }
}
