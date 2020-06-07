package day39_AccessModifiers;

public class Test {
    public static void main(String[] args) {
        AccessModifiers obj1 = new AccessModifiers();
        System.out.println(obj1.defaultAcces);
        System.out.println(obj1.publicAccess);
        // System.out.println(obj1.SSN); // private only access
    }
}
