package Practice;

import java.util.Scanner;

public class Task159_MethodsWithReurn4 {
    public static String c_profits (int buyPrice,int sellPrice){
        //your code here
        String result;
        if (buyPrice < sellPrice) {
            result = "profit";
        } else if(buyPrice > sellPrice) {
            result = "loss";
        } else {
            result = "no loss";
        }
        return result;


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(c_profits(num1, num2));
    }
}
