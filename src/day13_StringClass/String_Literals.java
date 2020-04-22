package day13_StringClass;

public class String_Literals {

    public static void main(String[] args) {
        String str1 = "Cat"; // string pool
        String str2 = new String("Cat"); // Java Heap

        System.out.println(str1 + " " + str2);
        System.out.println(str1 == str2); // two different objects, false

        String str3 = "Cat"; // String pool

        System.out.println(str1==str3); // true

        String str4 = new String("Cat");
        System.out.println(str2 == str4); // two independent objects, false

        String s1 = "Java"; // String pool, immutable we cannot modify it
        s1 = "JavaScript"; // new object will be created

        System.out.println(s1); // Java Script

        String s2 = "Java"; // no new object will be created in the memory

        System.out.println(s1 == s2);
        //                  "JavaScript" == "Java"
    }
}
