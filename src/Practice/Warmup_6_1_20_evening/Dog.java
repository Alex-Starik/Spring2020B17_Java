package Practice.Warmup_6_1_20_evening;

public class Dog extends Pets{

    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    public void eat(){
        System.out.println(name+" is eating");
    }
    public void speak(){
        System.out.println(name+" is barking");
    }

    public Dog(String name, int age, String color, String breed, String gender){
        this.name=name;
        this.age=age;
        this.color=color;
        this.breed=breed;
        this.gender=gender;
    }
}
