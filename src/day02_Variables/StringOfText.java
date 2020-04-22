package day02_Variables;

public class StringOfText {
    public static void main(String[] args) {
        String employeeName = "Oleksandr";
        String companyName = "Cybertek";
        System.out.println(employeeName); // Oleksandr
        System.out.println(companyName);

        System.out.println("Employee Name is "+ employeeName);

        System.out.println("Company Name is "+companyName);

        System.out.println(employeeName+" works at "+companyName);

        System.out.println("Employee Name is: "+employeeName+ "\nCompany Name is: "+companyName+ "\n"+ employeeName+ " works at "+companyName);
    }
}
