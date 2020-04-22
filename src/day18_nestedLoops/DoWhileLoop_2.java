package day18_nestedLoops;

public class DoWhileLoop_2 {

    public static void main(String[] args) {
        int number = 103; // print the number between 100 ~ number

        while(number>=100) {
            System.out.println(number);
            number--;
        }

        System.out.println("==============================");
        int num2 = 103;
        do {
            System.out.println(num2);
            num2--;
        } while(num2>=100);
    }
}
