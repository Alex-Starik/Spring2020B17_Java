package Practice;

import java.util.Scanner;

public class Shopping_List_2_Loop_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        System.out.println("Enter Item1 and its price:");
        item = scan.next();
        price = scan.nextInt();
        shoppingListReport += "Item"+count+": "+item+" Price: "+price;

        totalPrice += price;

        System.out.println("Add one more item?");
        countinue = scan.next();

        while (countinue.equalsIgnoreCase("yes")) {
            count++;
            System.out.println("Enter Item"+count+" and its price:");
            item = scan.next();
            price = scan.nextInt();
            shoppingListReport = shoppingListReport+ ", Item"+count+": "+item+" Price: "+price;

            totalPrice += price;

            System.out.println("Add one more item?");
            countinue = scan.next();

            if (countinue.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println(shoppingListReport);
        System.out.println("Total price: " +totalPrice);



    }
}
