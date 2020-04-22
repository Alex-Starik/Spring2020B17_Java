package Practice;

import java.util.Scanner;

public class Task_095_GetSandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int count = 0;
        while (str.contains("bread")) {

            str = str.replaceFirst("bread", "c");
            count++;

            if (str.contains("bread")) {
                str = str.replaceFirst("bread", "_");
                count++;
            }
            if (str.contains("bread")) {
                str = str.replaceFirst("bread", "s");
                count++;

            }
        }

            System.out.println(count);
            System.out.println(str);

            if (count == 1) {
                System.out.println("nothing");
            } else if (count == 2) {
                System.out.println(str.substring(str.indexOf("c") + 1, str.indexOf("_")));
            } else {
                str = str.replaceFirst("_", "bread");
                System.out.println(str.substring(str.indexOf("c") + 1, str.indexOf("s")));
            }

        }
    }


    // xxbreadbreadjambreadyy
