public class Book {
    private String title;
    private int pages;

    public int getPages(){
        return pages;
    }
    public void setPages(int pages){
        if(pages>0){
        this.pages = pages;}
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public static void main(String[] args) {
       Book b = new Book();
       b.setPages(3);
        System.out.println(b.getPages());
       b.setPages(-4);
        System.out.println(b.getPages());

    }
}
