package day38_Conctructors;
/*
Create class called SalaryCalculator
            instance variables:
                hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
            add a constructor can initialize those fields
            instance methods:
                salary(): returns the total salary as double
                salaryAftertax(): retuns the salary after tax as double
                stateTax(): retuns the total state tax as double
                federalTax(): retuns the total federal tax as double
                toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
 */
public class SalaryCalculator {
    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double fedralTaxRate;

    public SalaryCalculator (double hourlyRate, int weeklyHours, double stateTaxRate, double fedralTaxRate) {
        this.hourlyRate=hourlyRate;
        this.weeklyHours=weeklyHours;
        this.stateTaxRate=stateTaxRate;
        this.fedralTaxRate=fedralTaxRate;
    }

    public double salary(){
        return hourlyRate*weeklyHours*52;
    }

    public double stateTax() {
        return salary()*stateTaxRate;
    }

    public double federalTax() {
        return salary()*fedralTaxRate;
    }

    public double salaryAftertax() {
        return salary() - stateTax() - federalTax();
    }

    public String toString(){
        return "Hourly Rate: $"+hourlyRate+
                "\nWeekly Hours: "+weeklyHours+
                "\nGross Salary: $"+salary()+
                "\nState Tax: $"+stateTax()+
                "\nFederal Tax: $"+ federalTax()+
                "\nNet Salary: $"+salaryAftertax();
    }
}

class EmployeeSalary {

    public static void main(String[] args) {

        SalaryCalculator zareen = new SalaryCalculator(50, 40, 8.25 / 100, 0.2);

        System.out.println(zareen.salary());

        System.out.println(zareen);


        SalaryCalculator Namik = new SalaryCalculator(62, 40, 8.75/100, 0.26);

        System.out.println(Namik);
    }

}
