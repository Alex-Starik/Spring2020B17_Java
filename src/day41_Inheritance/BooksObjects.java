package day41_Inheritance;

public class BooksObjects {
    public static void main(String[] args) {
        Ebook book1 = new Ebook();
        book1.title = "Hamlet";
        book1.author = "Shakespeare";
        book1.price = 20;

        book1.size = "1.5MB";
        book1.pages = 432;

        System.out.println(book1);
        System.out.println("Size: "+book1.size);
        System.out.println("pages: "+book1.pages);

        book1.readbook();

        System.out.println("======================");

        AudioBook book2 = new AudioBook();
        book1.title = "Becoming";
        book1.author = "Michelle Obama";
        book1.price = 30;

        System.out.println(book2);
    }
}
