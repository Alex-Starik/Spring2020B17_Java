package day16_ForLoop;
/*
5. Write a program that will print out all letters in English alphabet in ascending order
	6. Write a program that will print out all letters in English alphabet in descedning order
 */
public class EnglishAlphabet {
    public static void main(String[] args) {
        for(char ch = 'A'; ch<= 'Z'; ch++) {
            System.out.print(ch+" ");
        }
        System.out.println("");
        for(char ch1 = 'Z'; ch1 >= 'A'; ch1--) {
            System.out.print(ch1 + " ");
        }
        System.out.println();
        System.out.println("=============================");

        for(char ch2 = 'a'; ch2 <='z'; ch2++){
            System.out.print(ch2+" ");
        }
    }
}
