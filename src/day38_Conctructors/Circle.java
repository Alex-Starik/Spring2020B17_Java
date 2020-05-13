package day38_Conctructors;



/*
Create a class called Circle
            instance variables:
                    radius, pi, diameter
            add a constructor that can initialize the radius of the circle
            instance methods:
                    area(): can return the area of the circle as double
                    perimeter(): cna return the perimeter of the circle as double
                    toString(): returns the info of the circle
            Note: global value of PI is 3.14
                  diameter of circle = 2 * radius
                  area of circle = PI * r * r
 */
public class Cicrcle {
    static double PI = 3.14;
    double radius;
    double diameter;

    public Cicrcle(double radius){
        this.radius = radius;
        diameter = radius * 2;
    }

    public double area(){
        return PI * radius * radius;
    }

    public double perimeter(){
        return diameter * PI;
    }

    public String toString(){
        return "Circles radius: "+radius+
                "\nCircles diameter: "+diameter+
                "\nCircles area: "+area()+
                "\nCircles perimeter: "+perimeter();
    }
}

class CircleObject {

    public static void main(String[] args) {
        double r = 7.1;

        Cicrcle circle1 = new Cicrcle(r);

        System.out.println(circle1.area());
    }
}
