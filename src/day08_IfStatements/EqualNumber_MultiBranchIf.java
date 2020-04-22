package day08_IfStatements;

public class EqualNumber_MultiBranchIf {

    public static void main(String[] args) {
        double n1 = 103.5;
        double n2 = 100.5;
        double n3 = 103.5;

        boolean n1Equaln2 = n1 == n2 && n1 != n3; // if n1 equal to n2 and doesnt equal n3, that makes n1 equal n2 only
        boolean n1Equaln3 = n1 == n3 && n1 != n2; // only n1 and n3 are equal
        boolean n2Equaln3 = n2 == n3 && n2 != n1; // only n2 and n3 are equal
        boolean allEqual = n1 == n2 && n1 == n3; // all of them are equal
        //boolean allNotEqual = n1 != n2 && n1 != n3 && n2 != n3; // all of them are not equal
        // boolean noneEqual = n1Equaln2 == false && n1Equaln3 == false && n2Equaln3 == false;
        // boolean noneEqual2 = !n1Equaln2 && !n1Equaln2 && !n2Equaln3;

        String result = " ";

        if (n1Equaln2) {
            //System.out.println("n1 is equal to n2");
            result = "n1 is equal to n2";
        } else if (n1Equaln3) {
            //System.out.println("n1 is equal to n3");
            result = "n1 is equal to n3";
        } else if (n2Equaln3) {
            //System.out.println("n2 is equal to n3");
            result = "n2 is equal to n3";
        } else if (allEqual) {
            //System.out.println("n1 is equal to n2 and n3");
            result = "n1 is equal to n2 and n3";
        } else {
            //System.out.println("None of them are equal");
            result = "None of them are equal";
        }
            System.out.println(result);

    }
}
