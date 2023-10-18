public class Book {
    String tytul;
    int numerStrony;
    boolean czyOtwarta = false;

    public void pokażTytul(){
        System.out.println("Tutul to : "+ tytul);
    }
    public void otworzStrone(int nr){
        numerStrony = nr;
        System.out.println("Numer strony: "+numerStrony);
    }    public void czyJestOtwarta(){
        System.out.println(czyOtwarta);
        
    }
    public void otworz(){
        czyOtwarta=true;
    }
    public void zamknij(){
        czyOtwarta=false;
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.tytul = "Harry Potter";
        b1.pokażTytul();
        b1.otworzStrone(21);
        b1.czyJestOtwarta();
        b1.otworz();
        b1.czyJestOtwarta();
        b1.zamknij();
        b1.czyJestOtwarta();
    }
}