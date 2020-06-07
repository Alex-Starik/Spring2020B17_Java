package day42_Inheritance;

class Test {
    public Test(int a){
        System.out.println("A");
    }
}

public class Constructor extends Test {

    public Constructor(){
        super(10); // A
        System.out.println("B");
    }

    public static void main(String[] args) {
        Test obj = new Test(10);// A
        Constructor obj2 = new Constructor();
    }
}
