package Practice;

import java.util.Scanner;

public class Zombie_Attack_1_Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inhabitants = scan.nextInt();

        // String result = "";

        int people = inhabitants;
        if( inhabitants == 0) {
            System.out.println("---- EXTINCT ----");
            System.exit(0);
        }

        for(int i = 0; people>=1; i++) {
            String result = "Day "+ i+ " ["+people+"]";

            people /= 2;
            System.out.println(result);
        }

        System.out.println("---- EXTINCT ----");
    }
}
