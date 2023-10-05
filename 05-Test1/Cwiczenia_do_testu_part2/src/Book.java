public class Book {
    String title;
    int pages;

    public void setPages(int pages) {
        if (pages>0){
            this.pages = pages;
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }
    public int getPages(){
        return this.pages;
    }
}
