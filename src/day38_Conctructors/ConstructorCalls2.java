package day38_Conctructors;

public class ConstructorCalls2 {

    public ConstructorCalls2(){
        System.out.println("Default constructor");
    }

    public ConstructorCalls2(int a){
        this(); // "Default constructor"
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls2(String str){

        this(5); // "Default constructor"
                    // "Constructor with int argument"

        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
        ConstructorCalls2 obj1 = new ConstructorCalls2("SALO");
    }

    public void method1(){
        // ConstructorCalls2();
    }

    {

    }
}
