public class Person {
    String imie;
    String nazwisko;
    Person(String imie,String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public String toString(){
        String znamie = "";
        znamie+=imie.toUpperCase().substring(0,1);
        znamie+=nazwisko.toUpperCase().substring(0,1);
        return znamie;
    }

    public static void main(String[] args) {
        Person p = new Person("Kacper","Kowalczyk");
        System.out.println(p.toString());
    }
}
