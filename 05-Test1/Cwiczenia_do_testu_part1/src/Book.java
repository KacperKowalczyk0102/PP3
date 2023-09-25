public class Book {
    private String title;
    private int pages;


    public void setPages(int pages){
        if(pages>0) {
            this.pages = pages;
        }
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return  this.title;
    }
    public int getPages(){
        return  this.pages;
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.setPages(3);
        b.setPages(-4);
        System.out.println(b.getPages());
    }

}
