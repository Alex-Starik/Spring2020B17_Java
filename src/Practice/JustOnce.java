package Practice;

public class JustOnce {
    public static void main(String[] args) {

    int num = 7;
        System.out.println( -num++ * 2 + --num + 8 / 2 + num-- + num++);

        // (-7) * 2 + 7 + 4 + 7 + 6
        // (-14) + 24 = 10

    }
}
