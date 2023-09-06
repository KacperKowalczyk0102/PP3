import java.util.Arrays;

public class Task18 {

    public static class StudentGrades {

        String studentName;
        int numberOfGrades;
        double[] grades;

        StudentGrades(String name, int numberOfGrades){
            this.studentName = name;
            this.grades = new double[numberOfGrades];
            for(int i =0;i<numberOfGrades;i++){
                int grade = (int) (Math.random()*7);
                this.grades[i] = 2.0 +grade/2.0;
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
            StudentGrades s1 = new StudentGrades("Amanda", new double[]{3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5});
            StudentGrades s2 = new StudentGrades("Jakub", new double[]{2.0, 3.0, 2.0, 4.5, 4.5});
            s1.status();
            s2.status();
            StudentGrades s3 = new StudentGrades("Kamil", 8);
            s3.status();
        }
    }


}
