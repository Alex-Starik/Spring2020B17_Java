package day21_MultiDimensionalArrays;
/*
2. write a program that can return the logest string of text from an array
	3. write a program that can return the shortest string of text from an array
 */
public class Longest_Shortest_Words {
    public static void main(String[] args) {

        String[] names = {"Reem", "Omer", "Muhtar", "Emrah", "Mohammed", "Ana"};

        int maxLangthString = names[0].length(); // 4
        int minLangthString = names[0].length();
        String longestWord = "";
        String shortestWord = "";

        for(int i = 1; i <= names.length-1; i++){ // or i < names.length;

            if(names[i].length() > maxLangthString) {
                maxLangthString = names[i].length();
                longestWord = names[i];
            }
            if(names[i].length() < minLangthString) {
                minLangthString = names[i].length();
                shortestWord = names[i];
            }

        }

        System.out.println(longestWord);
        System.out.println(shortestWord);
    }
}
