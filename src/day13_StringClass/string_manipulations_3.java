package day13_StringClass;

public class string_manipulations_3 {

    public static void main(String[] args) {
        String str = "I like java programming";
                int num1 = str.indexOf("j");

        System.out.println(num1);

        String str2 = "Cybertek school is awesome";
        //             0123456789
        int firstS = str2.indexOf("s");
        int secondS = str2.indexOf("is")+1;
        // int secondS = str2.indexOf("s ");

        System.out.println(firstS);
        System.out.println(secondS);

        //int maxIndexNumber = "Cybertek".length() - 1; // 8-1

        String names = "Muhtar";
        int a1 = names.indexOf("Good Guy");
        System.out.println(a1);

        String fullName = "Kuzzat Altay";
        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ")+1);

        System.out.println(firstName);
        System.out.println(lastName);

    }
}
