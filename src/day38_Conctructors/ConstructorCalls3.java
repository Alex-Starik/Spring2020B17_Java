package day38_Conctructors;

public class ConstructorCalls3 {

    public ConstructorCalls3(){
        // this(3); // int argument
        System.out.println("default");
    }

    public ConstructorCalls3(int a){
        this();
        System.out.println("Int argument");
    }

    public ConstructorCalls3(String str){
        // this("Hello");
    }

    public void method1(){
        // this();
        // method1();
    }

    public static void main(String[] args) {
        new ConstructorCalls3();
    }
}
