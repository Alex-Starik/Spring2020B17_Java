package day49_Polymorphism;



interface downloadable{
    boolean downloadable = true; // public static final
    void download(); // public abstract
}

interface AndroidApps extends downloadable{
    String AppStoreName = "Android"; // public static final
}

interface AppleApps extends downloadable{
    String AppStoreName = "Apple"; // public static final
}


public abstract class Phone {
    static String brand;
    String model;
    double price;
    String size;

    public abstract void texting(long phoneNumber);
    public abstract void calling(long phoneNumber);

    public String toString(){
        return "brand='" + brand + ", model='" + model + ", price=" + price + ", size='" + size;
    }
}
