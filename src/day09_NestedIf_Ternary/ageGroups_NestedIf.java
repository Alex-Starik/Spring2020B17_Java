package day09_NestedIf_Ternary;
/*
    write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
     */
public class ageGroups_NestedIf {
    public static void main(String[] args) {
        int age = 54;
        String group = "";

        if (age > 0 && age < 150) {
            group = (age < 21) ? "Teenager" : (age < 55) ? "Adult" : "Senior";


        } else {
            group = "Invalid Entry";
        }
        System.out.println(group);
    }
}
