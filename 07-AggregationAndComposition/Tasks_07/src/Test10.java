public class Test10 {
    public static void main(String[] args) {
        Writer writer = new Writer("Kacper", "Kowalczyl",21, false );
        Book book1 = new Book(writer, 100, "Harry Potta", "Fantasy", 0);
        Book book2 = new Book(writer, 200, "Harry Potta 2", "Fantasy", 0);

        Bookcase bookcase = new Bookcase();
        bookcase.addBook(book1);
        bookcase.addBook(book2);
        bookcase.displayBooks();
    }
}
