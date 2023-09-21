import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        Book book1 = new Book("Harry Potta", "JKRownling");
        Book book2 = new Book("Harry Potta 2", "JKRownling");
        Book book3 = new Ebook("Harry Potta 2", "JKRownling", "harri.txt");
        Book book4 = new AudioBook("Ja","Pan Tadeusz", 10,50 );
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        Library library = new Library(books);
        library.display();

        book1.display();
        book2.display();
        book3.display();
        book4.display();
    }

}