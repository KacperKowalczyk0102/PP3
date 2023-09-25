public class Book {
    private  String author;
    private  String title;
    private Publisher publisher;

    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAuthor(){
        return this.author;
    }
    public Publisher getPublisher(){
        return publisher;
    }
    public void setPublisher(Publisher publisher){
        this.publisher = publisher;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void display(){
        System.out.println("Tytuł: "+ this.title);
        System.out.println("Autor: "+ this.author);
        System.out.println("Wydawca: "+ this.publisher);
        System.out.println("");
    }
}
