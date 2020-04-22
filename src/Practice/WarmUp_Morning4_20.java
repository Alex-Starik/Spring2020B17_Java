package Practice;

import java.util.Scanner;

/*
Warm up tasks:
    1. write a return method named getDriver1 that accepts a string parameter called Browser
                if the browser name matches with {"chrome", "firefox", "id", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
                    Ex: getDriver("chrome");  ==> "Chrome Driver"
                        getDriver("fireFOX"); ==> "FireFox Driver"
                            ....
                if the browser name does not match with any of browsers above, the method should return "Invalid"
                APPLY SWITCH STATEMENTS
    2. do the first task with multi-branch if statement instead of switch statement
    3. do the first task with ternaries instead of switch statements
 */
public class WarmUp_Morning4_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String nameOfB = scan.next();
        nameOfB = nameOfB.toLowerCase();
        System.out.println(getDriver1(nameOfB));
        System.out.println("=======================================");
        System.out.println(getDriver2(nameOfB));
        System.out.println("=======================================");
        System.out.println(getDriver3(nameOfB));
    }
    public static String getDriver1 (String Browser) {
        // String [] arr1 = {"chrome", "firefox", "id", "safari", "edge", "Opera"};
        String result="";

        switch (Browser) {
            case "chrome":
                result = "Chrome Driver";
                break;
            case "firefox":
                result = "FireFox Driver";
                break;
            case "id":
                result = "ID Driver";
                break;
            case "safari":
                result = "Safari Driver";
                break;
            case "edge":
                result = "Edge Driver";
                break;
            case "opera":
                result = "Opera Driver";
                break;
        }

        return result;
    }
    public static String getDriver2 (String Browser2) {
        String [] arr1 = {"chrome", "firefox", "id", "safari", "edge", "opera"};
        String result = "";
        if(Browser2.equals(arr1[0])) {
            result = "Chrome Driver";
        } else if (Browser2.equals(arr1[1])) {
            result = "FireFox Driver";
        } else if (Browser2.equals(arr1[2])) {
            result = "ID Driver";
        } else if (Browser2.equals(arr1[3])) {
            result = "Safari Driver";
        } else if (Browser2.equals(arr1[4])) {
            result = "Edge Driver";
        } else if (Browser2.equals(arr1[5])) {
            result = "Opera Driver";
        }
        return result;
    }
    public static String getDriver3 (String Browser3) {
        String [] arr1 = {"chrome", "firefox", "id", "safari", "edge", "opera"};
        String result = (Browser3.equals(arr1[0])) ? "Chrome Driver" : (Browser3.equals(arr1[1])) ? "FireFox Driver" : (Browser3.equals(arr1[2])) ?
                "ID Driver" : (Browser3.equals(arr1[3])) ? "Safari Driver" : (Browser3.equals(arr1[4])) ? "Edge Driver" : "Opera Driver";
        return result;

    }
}
