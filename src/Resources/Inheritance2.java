package Resources;

import day42_Inheritance.Accessmodifiers;
import day42_Inheritance.TestData2;

public class Inheritance2 extends Accessmodifiers {

    public static void main(String[] args) {
        System.out.println(TestData2.publicVariable);
        System.out.println(TestData2.protectedVariable);
        //System.out.println(TestData2.defaultVariable);
        //System.out.println(TestData2.privateVariable);


        TestData2.protectedMethod();
        TestData2.publicMethod();
        //TestData2.privateMethod();
        //TestData2.defaultMethod();
    }
}
