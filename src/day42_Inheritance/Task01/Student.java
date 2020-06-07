package day42_Inheritance.Task01;

public class Student extends Person{

    public long studentID;
    public String clazz;
    public static String schoolName = "Cybertek";

    public void setStudentInfo(String name, int age, char gender, long studentID, String clazz){
        setPersonInfo(name, age, gender);
        this.studentID=studentID;
        this.clazz=clazz;
    }

    public void attendClass(){
        System.out.println(name+" is attending "+clazz);
    }

    public void code(){
        System.out.println(name+" is coding");
    }
    public String toString(){
        return "Name: "+name+"ID: "+studentID+",  age: "+age+", gender: "+gender+", class: "+clazz;
    }
}
