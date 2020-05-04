package day33_CustomClass;

public class Car {

    String Brand;
    String Model;
    String Color;
    int Year;

    public void start() {
        System.out.println(Brand+" is started");
    }

    public void drive() {
        System.out.println("Driving "+Brand+" "+Model);
    }

    public void getCarInfo(){
        System.out.println(Year+" "+Brand+" "+Model+" "+" "+Color);
    }

    public void setCarInfo(String carBrand, String carModel, int carYear, String carColor){
        Brand = carBrand;
        Model = carModel;
        Color = carColor;
        Year = carYear;

    }

    public String toString(){
        String result = Year+" "+Brand+" "+Model+" "+" "+Color;
        return result;
    }

    public static void main(String[] args) {
        int a = 100; // local variable
    }
}
