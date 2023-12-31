public class AudioBook extends Book {
    private int minutes;
    private int seconds;

    AudioBook(String author, String title, int minutes ,int seconds){
        super(author,title);
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public int getMinutes(){
       return this.minutes;
    }
    public int getSeconds(){
        return this.seconds;
    }
    public void setMinutes(int minutes){
        this.minutes = minutes;
    }
    public void setSeconds(int seconds){
        this.seconds = seconds;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Title = " + getTitle());
        System.out.println("Author = " + getAuthor());
        System.out.println("Seconds = " + this.seconds);
        System.out.println("Minutes " + this.minutes);
        System.out.println("Publisher : " + this.getPublisher());
    }
}
