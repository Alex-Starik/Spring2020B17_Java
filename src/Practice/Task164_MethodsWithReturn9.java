package Practice;

public class Task164_MethodsWithReturn9 {
    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){

        boolean result2 = month == 7 && day > 1 && day < 8;
        if (!isAvailable) {
            return false;
        } else if (result2) {
            return false;
        } else if (year != 2018) {
            return false;
        }
            return true;
    }

    public static void main(String[] args) {
        boolean avail = true;
        int month1 = 7;
        int day1 = 2;
        int year1 = 2018;

        boolean result = simpleRoomBook(avail, month1, day1, year1);
        System.out.println(result);
    }
}
