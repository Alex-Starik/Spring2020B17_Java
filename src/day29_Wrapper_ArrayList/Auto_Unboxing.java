package day29_Wrapper_ArrayList;

public class Auto_Unboxing {

    public static void main(String[] args) {
        int a = 100; // primitive

        Integer b = a; // Auto Boxing

        Byte byte1 = 98;

        short short1 = byte1; // Unboxing
        byte b2 = byte1; // Unboxing
        int int1 = byte1; // Unboxing
    }
}
