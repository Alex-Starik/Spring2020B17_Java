package Practice.WarmUp06_08_20;

public class phoneObjects {
    public static void main(String[] args) {
       Iphone iphone =  new Iphone("X", 1000, "10 inches");
       Iphone iphone2 =  new Iphone("8", 900, "8 inches");

        System.out.println(iphone);
        System.out.println(iphone2);

        iphone.calling(2028938476);
        iphone2.texting(234959);
        iphone.FaceTiming(91122345);

        System.out.println("================================");

        Samsung samsung1 = new Samsung("Note10 Plus", 1200, "Large");

        System.out.println(samsung1);
        samsung1.calling(34698568);
        samsung1.texting(346508);
        samsung1.freezing();
    }
}
