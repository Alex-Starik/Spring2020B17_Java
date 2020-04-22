package Practice;

public class Task160_MethodsWithReturn5_Hamlet {
    public static boolean hamletQuote(boolean toBe,boolean notToBe){
        if (!toBe && !notToBe) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean toBe1 = true;
        boolean notToBe1 = false;

        System.out.println(hamletQuote(toBe1, notToBe1));
    }
}
