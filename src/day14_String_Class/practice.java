package day14_String_Class;

public class practice {

    public static void main(String[] args) {
        String gmail = "cybertekschool@gmail.com";

        String userInputGmail = "CybertekSchool@gmail.com";

        boolean result = gmail.equalsIgnoreCase(userInputGmail); // true

        if (result) {
            System.out.println("Logged in");
        }

        System.out.println("===========================");

        /*
        valid password MUST contain a special characters such us (!, _, $)
        valid password should not contain spaces
         */

        String PassWord = "mmasd 1235";

        if (PassWord.contains(" ")) {
            System.out.println("Password cannot have space in it");
        } else {
            System.out.println("valid password");
        }

        System.out.println("===================================");
        /*
        every website has http at the beginning of the web address
         */
        String webAddress = "www.amazon.com";
            webAddress = webAddress.toLowerCase();

        if(webAddress.startsWith("www.")) {
            System.out.println("valid");
        }

        /*
        every single gmail address ends with @gmail.com
         */

        String email = "CybertekSchool@Yahoo.com";

        if(email.endsWith("@gmail.com")) {
            System.out.println("Valid Gmail");
        } else {
            System.out.println("Invalid Gmail");
        }

        /*
        write a program that can validate id a web address is valid

            valid web address:
                MUST starts with www.
                MUST ends with .com, or .edu, or .net, or .Gov
         */
    }
}
