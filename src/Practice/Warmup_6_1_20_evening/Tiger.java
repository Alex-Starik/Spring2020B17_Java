package Practice.Warmup_6_1_20_evening;

public class Tiger extends Pets{

    public void sleep(){
        System.out.println("Tiger is sleeping");
    }
    public void eat(){
        System.out.println("Tiger is eating");
    }
    public void speak(){
        System.out.println("Tiger is barking");
    }

    public Tiger(String name, int age, String color, String breed, String gender){
        this.name=name;
        this.age=age;
        this.color=color;
        this.breed=breed;
        this.gender=gender;
    }
}
