package day03_VariablesContinue;

public class SalaryCalculator {

    /*
    Create a class called salary calculator, write a program that can calculate the text, and salary after tax based on the hourly rate & tax rates
    ex:
            if:
    rate = 55;
    stateTax = 0.04;
    federalTax = 0.22;
    weeklyHours = 40;

    then output will be:
    your salary is: 105600 USD
    your total tax is: 27456 USD
    your income after tax is: 78144 USD
     */

    public static void main(String[] args) {
        double rate = 45;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        byte weeklyHours = 45;

        // salary = 55*40 or rate * weeklyHour * 4 * 13

        double salary = rate*weeklyHours*52;

        //stateTax = salary*stateTaxRate
        double stateTax = salary*stateTaxRate;

        //FederalTax = salary*federalTaxRate
        double federalTax = salary*federalTaxRate;

        //income after tax = salsry - (stateTax + federalTax)
        double incomeAfterTax = salary - (stateTax + federalTax);

        System.out.println("your salary is: "+salary+" USD");
        System.out.println("State tax is "+stateTax+ " USD");
        System.out.println("Federal tax is "+federalTax+ " USD");
        System.out.println("Total tax is: "+ (stateTax+federalTax));
        System.out.println("Your take home salary is: "+incomeAfterTax);

    }
}
