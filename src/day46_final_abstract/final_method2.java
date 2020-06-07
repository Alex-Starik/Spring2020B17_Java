package day46_final_abstract;

class Test{
        public void method1(){
            System.out.println("A");
        }
}

public class final_method2 extends Test{
    @Override
    public void method1(){
        System.out.println("B");
    }
}
