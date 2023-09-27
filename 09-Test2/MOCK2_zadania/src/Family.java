public class Family {
    private Person[] personArray;
    Family(Person[] personArray){
        this.personArray =personArray;
    }
    public int addults(){
        int numOfAdults = 0;
        for(Person person: personArray){
            if(person.getAge()>=18){
                numOfAdults++;
            }
        }
        return numOfAdults;
    }

    public static void main(String[] args) {
        Person[] personArray = {new Person("Kacper",21),new Person("Kinga",32),new Person("Michał",9)};
        Family f1 = new Family(personArray);
        System.out.println(f1.addults());
    }
}
