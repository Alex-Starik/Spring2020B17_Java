package day10_Siwtch_Scanner;

/*
write a program that can display the days based on the numbers 1 ~ 7

			MUST USE NESTED IF
			precindition: valid number for the day
 */
public class Days {
    public static void main(String[] args) {

        byte num = 8;
        String result = "";

        if (num >= 1 && num <= 7) {
            result = (num==1) ? "Monday" : (num==2) ? "Tuesday" : (num==3) ? "Wednesday"
                    : (num==4) ? "Thursday" : (num==5) ? "Friday" : (num==6) ? "Saturday"
                    : "Sunday";


        } else {
            result = "Invalid";
        }
        System.out.println(result);
    }
}
