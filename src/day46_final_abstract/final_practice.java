package day46_final_abstract;

public class final_practice {

    final int a = 100;
    final static int b = 20;

    {
        System.out.println(a);
        // a = 20; // cannot be reassigned
    }

    static {
        System.out.println(b);
       // b = 456;
    }

    public final_practice(){

    }

    final  void method1(){

    }

    public final static void method2(){

    }


    public void method1(int a){

    }

    class test extends final_practice{
        //@Override
        //protected void method1(){}
    }
}
