package day44_Exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {
        String str = "Cybertek";

        try {
            System.out.println(str.charAt(100));
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Completed");
    }
}
