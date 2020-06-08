package Practice.WarmUp06_08_20;

public class Iphone extends Phone {

    static {
        brand = "Iphone";
    }

    public Iphone(String model, double price, String size){
        this.model=model;
        this.price=price;
        this.size=size;
    }

    @Override
    public void calling(long phoneNumber){
        System.out.println("Iphone is calling with "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber){
        System.out.println("Iphone is texting with "+phoneNumber);
    }

    public void FaceTiming(long phoneNumber){
        System.out.println("Iphone is faceTiming with "+phoneNumber);
    }
}
