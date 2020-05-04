package Practice;



public class Draft {
   public static void main(String[] args) {
      String str = "     Such   a    good   day    today    ";
      str = str.replaceAll("\\s+", " ");
      // str = str.trim();
      System.out.println(str);
   }
}