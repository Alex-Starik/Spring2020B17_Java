package Resources;

import day40_Encapsulation.Encapsulation;

public class Encapsulation_Class {

    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();

        //Encapsulation_Class obj2 = new Encapsulation_Class();

        // obj2.SSN = 1000;
        obj.setSSN(456872687);
        System.out.println(obj.getSSN());

    }
}
