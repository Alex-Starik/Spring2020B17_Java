package Practice.Warmup_6_1_20_evening;

public abstract class Pets {
    String name;
    int age;
    String color;
    String breed;
    String gender;

    public abstract void sleep();
    public abstract void eat();
    public abstract void speak();

    public String toString(){
        return "My "+name+" is "+age+" years old. It is "+color+" "+breed+". It is "+gender;
    }

}
