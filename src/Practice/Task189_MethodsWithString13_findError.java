package Practice;

public class Task189_MethodsWithString13_findError {
    public static boolean isError(String line)
    {
        if(line.startsWith("error")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "2error foo bar";
        System.out.println(isError(str));
    }
}
