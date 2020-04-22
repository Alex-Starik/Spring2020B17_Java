package day19_Arrays;

public class Arrays_Intro {
    public static void main(String[] args) {

        // int scores = 90, 10, 20; regular variables can only have one data

        /*
        decleration:
				DataType[]  variableName = {data1, data2, data3};

				70, 75, 85, 90, 95, 100
         */

        int scores [] = {70, 75, 85, 90, 95, 100};
              // index:  0   1   2    3   4   5

        int num1 = scores [2]; // 85, int
        System.out.println(num1);

        int num2 = scores[5]; // 100, int

        String names [] = {"Garry", "Sulamoni", "Muhtar", "Asya", "Iman", "Kuzzat"};

        String name1 = names [5];

        System.out.println(name1);

        for (int i = 0; i <= 5; i++) {
            String name = names [i];
            System.out.println(name);
        }

        String[] emails = {"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com"};

            // printout all the users who registered with their gmail

            // max: 4

        for(int i = 0; i <= 3; i++) {
            String email = emails[i];
            if(email.endsWith("@gmail.com")) {
                System.out.println(email);
            }
        }

    }
}
