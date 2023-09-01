import org.w3c.dom.ls.LSOutput;

public class Book {
    String title;
    int num_of_pages;
    Boolean is_in_polish;
    float price;

   Book(String title, int num_of_pages, boolean is_in_polish, float price){
       this.title = title;
       this.num_of_pages = num_of_pages;
       this.is_in_polish = is_in_polish;
       this.price = price;
   }
    float get_price_per_page(){
        return this.price / this.num_of_pages;
    }

    String get_name(){
        return this.title;
    }

    public static void main(String[] args) {
        System.out.println("Test");

        Book book1 = new Book("Opowieści z Narni", 300, true,30.99F);
        Book book2 = new Book("Pan Tadeusz", 400, true,29.99F);
        System.out.println("Book 1");
        System.out.println(book1.get_name());
        System.out.println(book1.get_price_per_page() +"\n");

        System.out.println("Book 2");
        System.out.println(book2.get_name());
        System.out.println(book2.get_price_per_page());

    }
}
