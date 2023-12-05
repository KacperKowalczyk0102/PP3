import java.util.*;
public class Family{
    private ArrayList<Person> family = new ArrayList<Person>();
    public void add(Person p){
        family.add(p);
    }
    public int adults(){
        int counter = 0;
        for(Person person: family){
            if(person.getAge()>=18){
                counter++;
            }
        }
        return counter;
    }
    //dodatkowa funkcja do testów
    public Person[] people(){
        ArrayList<Person> family2 = new ArrayList<Person>();
        for(Person person: family){
            if(person.getAge()>=18){
                family2.add(person);
            }
        }
        Person[] familia = new Person[family2.size()];
        for(int i=0;i<family2.size();i++){
            familia[i]=family2.get(i);
        }
        return familia;
    
    
    
    
}
public static void main(String[] args) {
    Person p1 = new Person(19, "Kacper");
    Person p2 = new Person(19, "ola");
    Person p3 = new Person(17, "olek");
    Family f1 = new Family();
    f1.add(p1);
    f1.add(p3);
    f1.add(p2);
    Person[] peopleArray = f1.people();
    for (Person person : peopleArray) {
        System.out.println("Imię: " + person.getImie() + ", Wiek: " + person.getAge());
    }
}
}