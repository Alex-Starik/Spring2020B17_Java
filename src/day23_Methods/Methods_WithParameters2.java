package day23_Methods;

// create a function that can reverse any string

// "Muhtar" ==> rathuM,    "Cybertek" ==> ketrebyC
public class Methods_WithParameters2 {
    public static void main(String[] args) {
        ReverseString("Sanek");
        ReverseString("Cybertek School");
    }

    public static void ReverseString(String str) {
        for(int i = str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
