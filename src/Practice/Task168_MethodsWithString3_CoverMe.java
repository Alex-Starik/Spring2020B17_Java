package Practice;

public class Task168_MethodsWithString3_CoverMe {
    public static void main(String[] args) {
        System.out.println(coverString("Certified Wooden Spoon", "o") ) ; //java [me]thods
    }

    public static String coverString(String main, String coverME) {
        if (main.contains(coverME)) {
            String covered = "["+coverME+"]";
            main = main.replaceAll(coverME, covered);
            return main;
        }
            return "["+main+"]";
    }
}
