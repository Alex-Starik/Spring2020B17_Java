package day48_Abstraction;

public interface Interface2 {

    // public Interface2(){ }

    // public void method1(){ }

    // { }

    public static final int a = 100;

    public static void main(String[] args) {
        System.out.println(a); // by default static
        // a = 200; // by default final

        System.out.println(Interface2.a);
        Interface2.method4();
        // method6();
    }

    public static void method4(){

    }

    void method5();

    public default void method6(){
        System.out.println("Default method");
    }
}
