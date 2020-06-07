package day44_Exceptions;
/*
1. create a class called Browsers
			actions: openBrowser(): prints "opens the default browser"
					 closeBrowser(): closes the default browser
	2. create a class called ChromeBrowser
			actions: openBrowser(): opens the chrome browser
					 closeBrowser(): closes the chrome browser
	3. creata a class called FirefoxBrowser
			actions: openBrowser(): opens the Firefox browser
					 closeBrowser(): closes the Firefox browser
	4. create a class called Opera browser
			actions: openBrowser(): opens the Opera browser
					 closeBrowser(): closes the Opera browser
	5. create a class called Test:
			create an object of each browsers and call the openBrowser & closeBrowser actions
 */
public class Browsers {
    protected void openBrowser(){
        System.out.println("opens the default browser");
    }

    protected void closeBrowser(){
        System.out.println("closes the default browser");
    }
}

class ChromeBrowser extends Browsers{
        // openBrowser()
        // closeBrowser()

    public void openBrowser(){
        System.out.println("opens the Chrom Browser");
    }
    public  void closeBrowser(){
        System.out.println("closes the Chrom Browser");
    }
}

class FirefoxBrowser extends Browsers{
    // openBrowser()
    // closeBrowser()

    public void openBrowser(){
        System.out.println("opens the Firefox Browser");
    }
    public  void closeBrowser(){
        System.out.println("closes the Firefox Browser");
    }
}

class Test{
    public static void main(String[] args) {
        ChromeBrowser obj = new ChromeBrowser();
        obj.openBrowser();

        System.out.println("======================================");

        FirefoxBrowser obj1 = new FirefoxBrowser();
        obj1.closeBrowser();
    }
}
