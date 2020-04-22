package OfficeHours.Practice_04_01_2020;

public class StringMethods2 {

    public static void main(String[] args) {
        // isEmpty(): cheks if the string is empty, returns boolean

        String str1 = "      ";

              boolean r1 =  str1.isEmpty(); // false
        boolean r2 = !str1.isEmpty(); // true

        System.out.println(r1);
        System.out.println(r2);

        //equals(str); checks if the two string of text are equal or not, returns boolean
        // equalsIgnoreCase(str): checks if the two string of text are equal or not (without case sensitivity)

        //  ==

        String s1 = "cat";
        String s2 = new String ("cat");
        String s3 = "Cat";

        System.out.println(s1 == s2); // false

        System.out.println(s1.equals(s2)); //true
        System.out.println(s3.equals(s1)); // false, case sensitivity
        System.out.println(s3.equalsIgnoreCase(s1)); // true, ignores case sensitivity

        System.out.println("================================");
        // contains(str): cheks if the str is included in the string, returns boolean

        String sentence = "I like to lewarn Java";

        System.out.println(sentence.contains("Java"));  // true

        String sentence2 = "Top 3 Viruses are: 1. Corona, 2. Hanta, 3. Ebola";
        System.out.println(sentence2.contains("Corona")); // true
        System.out.println("================================");
        // startsWith(str): cheks if the string started with given str
        // endsWith(str): cheks if the string ended with given str

        String webAddress = "www.Amazon.com";
        System.out.println(webAddress.startsWith("www")); // true
        System.out.println(webAddress.startsWith("wwww")); // false

        String gmail = "CybertekSchool@gmail.com";
        System.out.println(gmail.endsWith("@gmail.com")); // true
        System.out.println(gmail.endsWith("@hotmail.com")); // false
        System.out.println(gmail.endsWith("@coldmail.com")); // false

    }
}
