package day33_CustomClass;

public class carObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.Brand = "BMW";
        car1.Model = "X5";
        car1.Color = "Red";
        car1.Year = 2020;

        System.out.println(car1.Brand);
        System.out.println(car1.Model);
        System.out.println(car1.Color);
        System.out.println(car1.Year);
        car1.start();
        car1.drive();
        car1.getCarInfo();

        System.out.println("===========================================");
        Car car2 = new Car();
        car2.Brand = "Toyota";
        car2.Model = "Corolla";
        car2.Color = "White";
        car2.Year = 2020;

        System.out.println(car2.Brand);
        System.out.println(car2.Model);
        System.out.println(car2.Color);
        System.out.println(car2.Year);

        car2.start();
        car2.drive();
        car2.getCarInfo();

        System.out.println("==========================================");
        Car car3 = new Car();
        car3.Brand = "Mercedes";
        car3.Model = "C Class";
        car3.Color = "Black";
        car3.Year = 2020;

        car3.getCarInfo();

    }
}
