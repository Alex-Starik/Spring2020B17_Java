package day14_String_Class;
/*
       write a program that can validate id a web address is valid

           valid web address:
               MUST starts with www.
               MUST ends with .com, or .edu, or .net, or .Gov
        */
public class WebAddressValidator {

    public static void main(String[] args) {
        String website = "WWW.cybertek.Gov";
        website = website.toLowerCase();

        boolean validEnding = website.endsWith(".com") ||website.endsWith(".edu") || website.endsWith(".gov");

        if(website.startsWith("www.") && validEnding) {


            System.out.println("Valid address");
        } else {
            System.out.println("Invalid Address");
        }

    }
}
