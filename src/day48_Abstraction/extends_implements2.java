package day48_Abstraction;

interface P{
    void method1();
}

interface Q{
    int method2();
}

abstract class R{
    abstract void method3();
}

public class extends_implements2 extends  R implements  Q{

    public static void main(String[] args) {
        // R obj = new R(); // not concrete
        // Q obj = new Q(); // not concrete

    }
    public int  method2(){
        return 0;
    }
    void method3(){

    }
}
