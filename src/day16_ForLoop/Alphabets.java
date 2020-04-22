package day16_ForLoop;

public class Alphabets {

    public static void main(String[] args) {
        String upperCase = ""; // A~Z
        String lowerCase = ""; // a~z

        for(char ch = 'A'; ch <= 'Z'; ch++){
            upperCase += ch;
        }

        System.out.println(upperCase);

        for(char ch = 'a'; ch <= 'z'; ch++) {
            lowerCase += ch;
        }
        System.out.println(lowerCase);

        String result ="";
        for(int i=0; i <= upperCase.length()-1; i++){
            result += upperCase.charAt(i)+"" +lowerCase.charAt(i)+" ";
        }
        System.out.println(result);

        // second solution
        int a = 97;
        int A = 65;

        for(int i = 0; i <= 25; i++){
            char ch3= (char) (A+i); // 65+0
            char ch4 = (char) (a+i); // 97+0
            System.out.print(ch3+""+ch4+" ");
        }

    }
}
