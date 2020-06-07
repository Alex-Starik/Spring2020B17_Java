package day44_Exceptions;

public class Wait {

    public static void main(String[] args) {
        System.out.println("I am here");
        wait2(2.5);
    }

    public static void wait2(double seconds){
        System.out.println("Hello");

        try {
            Thread.sleep((long)seconds * 1000);
        } catch(Exception e){

        }
        System.out.println("Cybertek");

        try {
            Thread.sleep((long)seconds * 2000);
        } catch(Exception e){

        }

        System.out.println("Java");

        try {
            Thread.sleep((long)seconds * 3000);
        } catch(Exception e){

        }

        System.out.println("Completed");
    }

}
