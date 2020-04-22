package Practice;

public class Task162_MethodsWithReturns {

    public static boolean threeLocks(boolean a, boolean b, boolean c) {
        if (a && b) {
            return a;
        } else if (c) {
            return c;
        }
        return false;
    }//end threeLocks

    public static void main(String[] args) {
        boolean d = true;
        boolean e = false;
        boolean f = false;

        System.out.println(threeLocks(d, e, f));
    }
}
