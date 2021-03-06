package day37_Constructors;

public class CybertekStudents {

    static String schoolName = "Cybertek University";
    String studentName;
    int groupNumber;
    String batch;

    public CybertekStudents(String studentName, int groupNumber, String batch){
        // schoolName = "Cybertek University";

        this.studentName=studentName;
        this.groupNumber=groupNumber;
        this.batch=batch;
    }

    public String toString(){
        return "Name: "+studentName+", Batch: "+batch+", in group: "+groupNumber+", School Name: "+schoolName;
    }

}

class Test{
    public static void main(String[] args) {
        CybertekStudents student1 = new CybertekStudents("Drar", 3, "Batch 18");
            student1.schoolName = "Harvard";
        System.out.println(student1);

        CybertekStudents student2 = new CybertekStudents("Sarah", 12, "Batch 18");

        System.out.println(student2);
    }
}
