package day29_Wrapper_ArrayList;

public class ParseMethods {
    public static void main(String[] args) {
        String str = "123";

        int a1 = Integer.parseInt(str); // 123

        System.out.println(str+1); // text
        System.out.println(a1+1); // number

        byte b1 = Byte.parseByte(str); // byte = 123

        System.out.println(b1);

        Integer I1 = (int) Byte.parseByte(str); // AutoBoxing

        String str2 = "10.5";
        float f1 = Float.parseFloat(str2); // float 10.5

        System.out.println(f1);

        double f2 = Double.parseDouble(str2); // double 10.5

        System.out.println(f2);

        String str3 = "3147483647";

        long l1 =  Long.parseLong(str3);

        System.out.println(l1);

        Long l2 =  Long.parseLong(str3); // autoboxing

        System.out.println(l2);


        String result1 = "true";

        boolean a = true;

        boolean r1 = Boolean.parseBoolean(result1); // boolean

        System.out.println(r1);


        String result2 = "fALsE"; // false
        boolean r2 = Boolean.parseBoolean(result2); // boolean

        System.out.println(r2);
    }
}
