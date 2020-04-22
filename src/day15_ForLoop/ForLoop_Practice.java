package day15_ForLoop;

public class ForLoop_Practice {
    public static void main(String[] args) {
        /*
        odd number between 1~100 in a single line separated be a space
                        1 3 5 7 9...
         */
        for (int number = 1; number<=100; number += 2) {
            System.out.print(number+" ");
        }
    }
}
