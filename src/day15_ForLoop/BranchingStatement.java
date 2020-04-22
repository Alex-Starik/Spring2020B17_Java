package day15_ForLoop;

public class BranchingStatement {

    public static void main(String[] args) {
        // System.exit(0):
        for (int i = 0; i<5; i++) {
            if(i%2 != 0) {
                System.exit(0); // stops the entire program immediately
            }
            System.out.println(i);
        }

        System.out.println("Test completed");
    }
}
