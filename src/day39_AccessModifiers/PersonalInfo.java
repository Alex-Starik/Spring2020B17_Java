package day39_AccessModifiers;
/*
task:
	create class for Student
			instance variables:
					name, id, age, gender, grade, SSN

					public: name, age, gender
					private: grade, SSN, id
 */
public class PersonalInfo {
    public static String name = "Sanek";
    public static char gender = 'M';

    static int age = 32;
    static char grade = 'A';

    private static long SSN = 12647654;
    private static long ID = 26545975;
}

class CheckInfo {
    public static void main(String[] args) {
        System.out.println("Name: "+PersonalInfo.name);
        System.out.println("Gender: "+PersonalInfo.gender);

        System.out.println("Grade: "+PersonalInfo.grade);

        // System.out.println("SSN: "+PersonalInfo.SSN);
    }
}
