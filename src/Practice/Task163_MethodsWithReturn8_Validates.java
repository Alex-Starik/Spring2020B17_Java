package Practice;

public class Task163_MethodsWithReturn8_Validates {

    public static boolean validateTask(boolean notEmpty,int taskId,int currentId){
        if (!notEmpty) {
            return false;
        }
         else if (currentId+1 == taskId) {
            return notEmpty;
        }

        return !notEmpty;
    }

    public static void main (String[] args) {
        boolean notEmpty1 = true;
        int taskId1 = 2;
        int currentId1 = 1;

        System.out.println(validateTask(notEmpty1, taskId1, currentId1));
    }
}
