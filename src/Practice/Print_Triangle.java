package Practice;

import java.util.Scanner;

public class Print_Triangle {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String str = "*";
        System.out.println("*");
        for (j = 1; j < n; j++) {
            str +="*";
            System.out.println( str);
        }



        /*while (i >= n) {
            while (j <= n) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

         */



        // for (int a=1; a<=n; a++) {
           //  int c = n;

           // for (int b=1; b<n; b++){
               // System.out.println("*");


            //System.out.println("");
        // }


    }
}