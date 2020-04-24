package day28_DateTime;

import java.time.LocalDate;

/*
Warmup task:
	1. create an array of string, store five of your friends names in it
	2. create Array of localdates and store thier birthdays in the same order
	3. use for loop to print out your friends' names and thier birthdays
 */
public class LocalDate_Practice {
    public static void main(String[] args) {

        String [] friends = {"Vika", "Vlad", "Jeka"};

        LocalDate VikaBirthday = LocalDate.of(1985, 6, 4);
        LocalDate VladBirthday = LocalDate.of(2014, 11, 18);
        LocalDate JekaBirthday = LocalDate.of(2008, 4, 9);

        LocalDate [] Birthday = {VikaBirthday, VladBirthday, JekaBirthday};

        for(int i = 0; i < friends.length; i++) {
            String name = friends[i];
            LocalDate day = Birthday [i];
            System.out.println(name+ "`s birthday is " + day);
        }
    }
}
