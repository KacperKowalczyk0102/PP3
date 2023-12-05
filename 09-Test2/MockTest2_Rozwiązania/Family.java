public class Family{
    private Person[] p;
    Family(Person[] p){
        this.p = p;

    }
    public int adult(){
        int sum = 0;
        for(Person person : p)
        if(person.getAge()>=18){
            sum++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Person[] personArray = {new Person("Kacper",21),new Person("Kinga",32),new Person("Michał",9)};
        Family f1 = new Family(personArray);
        System.out.println(f1.adult());
    }
}