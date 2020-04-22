package Practice;

import java.util.Scanner;

/*
write a java program that can convert any given numbers between 0 ~ 9 to words,
if the number is greater than 9 or less than zero, out put should be "Invalid".
 */
public class switch_statement_practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        byte num = scan.nextByte();
        String word = "";

        switch (2){

            case 1:
                word = "life";
                break;

            case 2:
                word = "love";
                break;

            case 3:
                word = "smile";
                break;

            case 4:
                word = "family";
                break;

            case 5:
                word = "Sun";
                break;

            case 6:
                word = "God";
                break;

            case 7:
                word = "kids";
                break;

            case 8:
                word = "wife";
                break;

            case 9:
                word = "Earth";
                break;

            default:
                word = "Invalid";
        }

        System.out.println(word);

    }
}
