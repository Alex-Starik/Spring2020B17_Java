package Practice;

import java.util.Scanner;

public class Practice_CustomClass_05_05_2020_Pizza {

    String size;
    int numCheese;
    int numPepper;
    double totalCost = 0;

    public void customizeOrder(){
        System.out.println("What the size would you like to choose? Small, Medium or Large?");
        Scanner input = new Scanner(System.in);
        size = input.next();

        System.out.println("How many cheese topping would you like?");
        numCheese = input.nextInt();

        System.out.println("How many pepperoni topping would you like?");
        numPepper = input.nextInt();
    }

    public double calcCost(){

        if (size.equalsIgnoreCase("small")) {
            totalCost += 10;
        } else if (size.equalsIgnoreCase("medium")) {
            totalCost += 12;
        } else {
            totalCost += 14;
        }

        totalCost += numCheese;
        totalCost = totalCost + numPepper*1.5;

        return totalCost;
    }

    public String toString(){
        return ("Your order is: size - "+size+", quantity of cheese topping - "+numCheese+", quantity of pepperoni topping - "+numPepper+". Total price is: "+totalCost);
    }
}
