import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<Person> family = new ArrayList<Person>();
    public void add(Person p){
        family.add(p);
    }
    public int adults(){
        int suma = 0;
        for(Person osoba: family){
            if (osoba.getAge()>=18){
                suma++;
            }
        }return suma;
    }
}
