import java.util.ArrayList;

public class Library {
    private ArrayList<Book> shelf = new ArrayList<Book>();
    public Library(ArrayList<Book> shelf){
        this.shelf = shelf;
    }
    public void display(){
        System.out.println("=== Library ===");
        for(Book book: shelf){
            System.out.println("Title: "+ book.getTitle());
            System.out.println("Author: "+ book.getAuthor());
            System.out.println("");
        }
    }

}
