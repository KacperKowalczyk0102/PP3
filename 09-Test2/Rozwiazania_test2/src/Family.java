import java.util.ArrayList;

public class Family {
    private ArrayList<Person> fam = new ArrayList<Person>();

    public void add(Person p){
        fam.add(p);
    }
    public int addults(){
        int count = 0;
        for(Person p : fam){
            if(p.getAge()>=18){
                count++;
            }
        }return count;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Kacper", 21);
        Family f1 = new Family();
        f1.add(p1);



    }
}
