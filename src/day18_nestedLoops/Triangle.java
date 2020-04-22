package day18_nestedLoops;

public class Triangle {
    public static void main(String[] args) {

        int z = 7;
        while (z >= 1) {
            int i = 1;
            while (i <= z) {
                System.out.print("* ");
                i++;
            }
            System.out.println();

            z--;
        }

    }
}
