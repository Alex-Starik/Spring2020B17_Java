package day39_AccessModifiers;
/*
create a class called Employee:
				instance variables:
						name, jobTitle, ID, salary
				add a constructor that can initialize name of employee
				add a constructor that can initialize name, jobTitle of the employee
							(apply constructor call to initialize the name)
				add a constructor that can initialize name, jobTitle, ID of the employee
							(apply constructor call to initialize the name and jobTitle)
				add a constructor that can initialize name, jobTitle, ID, salary of employee
							(apply constructor call to initialize the name, jobTitle, ID)
				add toString method
 */
public class Employee {
    String name;
    String jobTitle;
    long id;
    double salary;

    public Employee (String name) {
        this.name = name;
    }

    public Employee (String name, String jobTitle) {
        this(name);
        this.jobTitle = jobTitle;
    }

    public Employee (String name, String jobTitle, long id) {
        this(name, jobTitle);
        this.id = id;
    }

    public Employee (String name, String jobTitle, long id, double salary) {
        this(name, jobTitle, id);
        this.salary = salary;
    }

    public String toString (){
        return "Name is: "+name+", Job title is: "+jobTitle+", ID is: "+id+", Salary is: $"+salary;
    }
}

class EmoloyeeObjects {

    public static void main(String[] args) {


        Employee emp1 = new Employee("Alex", "SDET", 7775577, 150_000);

        System.out.println(emp1);
    }


}
