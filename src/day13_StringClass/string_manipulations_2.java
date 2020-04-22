package day13_StringClass;

public class string_manipulations_2 {

    public static void main(String[] args) {

        String str = "Cybertek school is the best";
        //            012345678
        String schoolName = str.substring(0,8);

        System.out.println(schoolName);

        String fullName = "Kuzzat Altay";
        String firstName = fullName.substring(0, 6);
        String lastName = fullName.substring(7, 12);

        System.out.println(firstName);
        System.out.println(lastName);

        // full name = first name + last name
        // gmail: lastName_firstName@gmail.com

        String name = "Oleksandr Starik";
        String firstname = name.substring(0 , 9);
        String lastname = name.substring(10, 16);

        String gmail = lastname.concat("_").concat(firstname).concat("@gmail.com");

        System.out.println(gmail);
        //System.out.println(lastname+"_"+firstname+"@gmail.com");

        String s1 = "I love Java Programming Language";

        String className = s1.substring(7);

        System.out.println(className);

        String s2 = "I like C# Programming";
             s2 =    s2.replace("C#", "Java");
        System.out.println(s2);

        String name1 = "COVID 18";
        name1 = name1.replace("8", "9");

        System.out.println(name1);

        String r1 = "I like C#, C# is fun, C# is cool";
        r1 = r1.replaceFirst("C#", "Java");

        System.out.println(r1);


    }
}
