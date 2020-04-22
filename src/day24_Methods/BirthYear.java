package day24_Methods;

public class BirthYear {
    public static void Age(int birthYear) { // 2000
        int currentYear = 2020;
        int age = currentYear - birthYear;
        if (birthYear < currentYear) {
            System.out.println(age);
        } else {
            System.out.println("You are not born yet");
        }
    }

    public static void main(String[] args) {

        Age(1987);
        printHelloCybertek();
    }
    public static void printHello(){
        System.out.println("Hello");
    }
    public static void printCybertek(){
        System.out.println("Cybertek");
    }
    public static void printHelloCybertek() {
        printHello(); // Hello
        printCybertek(); // Cybertek
    }
}
