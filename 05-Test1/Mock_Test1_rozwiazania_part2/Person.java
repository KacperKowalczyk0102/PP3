public class Person{
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public boolean isAdults(){
        if(age>=18){
    return true;
        }
        return false;
    }
    public String toString(){
        return getName()+","+getAge();
    }
    public static void main(String[] args) {
        Person p1 = new Person("Kacper", 21);
        Person p2 = new Person("Ania", 17);
        System.out.println(p2.isAdults());
        System.out.println(p1.isAdults());

    }

}

