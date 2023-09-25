public class Ebook extends Book {
    private String fileName;

    public Ebook(String author, String title, String fileName) {
        super(author, title);
        this.fileName = fileName;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        System.out.println("Title = " + getTitle());
        System.out.println("Author = " + getAuthor());
        System.out.println("filename = " + this.fileName);
        System.out.println("Publisher = "+ this.getPublisher());
        System.out.println();
    }
}
