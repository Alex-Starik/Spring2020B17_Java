package day40_Encapsulation;

public class Person {

    public String name;

    private long SSN;
    private long ID;

    public Person(String nsme){this.name = name;}
}

class Person_Objects{
    public static void main(String[] args) {
        Person Zarina = new Person("Zarina");
        System.out.println(Zarina.name);
        // System.out.println(Zarina.SSN);
    }
}
