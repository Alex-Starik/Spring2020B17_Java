package day38_Conctructors;

public class Dog {
    String name;
    String breed;
    int age;

    public Dog(){
        name = "unknown";
        breed = "unknown";
        age = 0;
    }

    public Dog (String breed){
        this.breed = breed;
        name = "unknown";
        age = 0;
    }

    public Dog (String breed, int age){
        this.breed = breed;
        name = "unknown";
        this.age = age;
    }

    public String toString(){
        return "Name: "+name+", breed: "+breed+", age:"+age;
    }


}

class dogObjects{

    public static void main(String[] args) {


        Dog dog1 = new Dog();

        Dog dog2 = new Dog("Husky");

        Dog dog3 = new Dog("Poodle", 4);

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
    }
}
