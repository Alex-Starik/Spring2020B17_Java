package Practice.Warmup_6_1_20_evening;

public class Cat extends Pets{

    public void sleep(){
        System.out.println("Cat is sleeping");
    }
    public void eat(){
        System.out.println("Cat is eating");
    }
    public void speak(){
        System.out.println("Cat is barking");
    }

    public Cat(String name, int age, String color, String breed, String gender){
        this.name=name;
        this.age=age;
        this.color=color;
        this.breed=breed;
        this.gender=gender;
    }
}
