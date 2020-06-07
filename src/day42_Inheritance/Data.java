package day42_Inheritance;

public class Data {
    public static  String publicData = "public";
    protected static String protectedData = "protected";
    static String defaultData = "default";
    private String privateData = "private";


}

class testing extends Data{
    public static void main(String[] args) {
        System.out.println(TestData.publicData);
        System.out.println(TestData.protectedData);
        System.out.println(TestData.defaultData);
        //System.out.println(TestData.privateData);
    }
}
