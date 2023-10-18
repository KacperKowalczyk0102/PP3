public class Student {
    String name;
    int age;
    String studentCrad;
    boolean isSCardValid = true;
    int semestr;
    float grade;


    public void sayHello(){
        System.out.println("Hello");
    }
    public void displayName(){
        System.out.println("Moje imie i nazwisko to: "+ name);

    }
    public void displayAge(){
        System.out.println("My age is: "+age);
    }
    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("Semestr "+ semestr);
        System.out.println("grade "+grade);
        System.out.println("IsCardValid "+isSCardValid);
    }
    public boolean change(boolean valid){
        return isSCardValid= valid;
    }




}
