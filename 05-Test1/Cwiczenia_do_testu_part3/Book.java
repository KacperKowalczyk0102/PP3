public class Book {
    private String title;
    private int page;

    Book(String title, int page){
        this.title = title;
        this.page = page;
    }
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        if(page>=0){
        this.page = page;
        }
    }
    public static void main(String[] args) {
        Book b = new Book("Harry Potter", 10);
        b.setPage(3);
        b.setPage(-4);
        System.out.println(b.getTitle());
        System.out.println(b.getPage());
        }

    
}
