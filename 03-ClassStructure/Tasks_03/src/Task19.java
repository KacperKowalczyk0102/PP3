import java.util.Arrays;
import java.util.Scanner;

public class Task19 {


    public static class StudentGrades {

        String studentName;
        int numberOfGrades;
        double[] grades;

        StudentGrades(String name, int numberOfGrades){
            this.studentName = name;
            this.grades = new double[numberOfGrades];
            for(int i=0; i< numberOfGrades;i++) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter grade for " + this.studentName);
                double grade = scanner.nextDouble();
                grades[i] = grade;
            }
        }

        StudentGrades(String name, double[] grades) {
            this.studentName = name;
            this.grades = grades;
        }

        double lowesrtMark() {
            double[] low = this.grades;
            Arrays.sort(low);
            return low[0];
        }

        double highestMark() {
            double[] high = this.grades;
            Arrays.sort(high);
            return high[high.length - 1];
        }

        int numOfGrades() {
            return this.grades.length;
        }

        double gradesAverage() {
            double sum = 0;
            for (double grade : this.grades) {
                sum += grade;
            }
            return sum / numOfGrades();
        }

        void status() {
            System.out.println("Student name: " + this.studentName);
            System.out.println("Student list of grades: " + Arrays.toString(this.grades));
            System.out.println("Num of grades: " + this.numOfGrades());
            System.out.println("Lowest mark: " + lowesrtMark());
            System.out.println("Highest mark: " + highestMark());
            System.out.println("Average: " + gradesAverage());
            System.out.println("");
        }

        public static void main(String[] args) {
            Task19.StudentGrades s1 = new Task19.StudentGrades("Amanda",6);
            s1.status();
            Task19.StudentGrades s2 = new Task19.StudentGrades("Jakub",8);
            s2.status();
        }
    }


}

