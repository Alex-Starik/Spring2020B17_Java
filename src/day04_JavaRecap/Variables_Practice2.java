package day04_JavaRecap;

import com.sun.corba.se.impl.encoding.CDROutputObject;

public class Variables_Practice2 {

    public static void main(String[] args) {
        /*
        task: write a program to find the area and perimeter of the circle
                radious = ?
                Pi = 3.14

                Area = r * r * 3.14
                P = 2 * 3.14 * r
         */

        double radious = 5;
        double Pi = Math.PI;

        double Area = radious * radious * Pi;
        double P = 2 * Pi * radious;

        // The are of the circle that has a radious of ___ is: ____
        System.out.println("The area of the circle that has a radious of "+ radious+ " is: "+ Area);
        System.out.println("The perimeter of the circle that has a radious of "+ radious+ " is: "+ P);


        // QUESTION FROM INTERVIEW
        double circle1R = 3;
        double circle2R = 5;

        boolean circle1 = circle1R > circle2R;
        boolean circle2 = circle2R > circle1R;

        System.out.println(circle2);


    }
}
