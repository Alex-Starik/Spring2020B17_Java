package day36_StaticBlock;

import day34_CustomClass.Tester;

import static day36_StaticBlock.StaticBlock2.tester1;

public class StaticBlock3 {
    static String name;
    static int num;

    static Tester tetster1;


    /*public static void main(String[] args) {
        name = "Muhtar";
        num = 200;
    }
     */
    static {
        name = "Muhtar";
        num = 100;
        tetster1 = new Tester();
        tester1.setTesterInfo("Jean", 123, "SDET", 200000);
    }
}
