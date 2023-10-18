public class StudentTest {
    public static void main(String[] args) {

        // object creation
        Student s = new Student();
        Student s2 = new Student();

        // object manipulation
        //s.name = "Peter";
        //s.age = 21;

        s2.name = "Kacper";
        s2.age = 21;
        s2.grade = 4.0f;
        s2.semestr = 3;
        s2.change(false);
        s2.display();

    }
}
