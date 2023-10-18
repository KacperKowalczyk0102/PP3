public class Main {
    public static void main(String[] args) {
        float heightInCm = 170f;
        float feet = heightInCm / 30.48f;
        double remainingInches = (heightInCm % 30.48) / 2.54;

        System.out.println("Mam " + heightInCm + " cm wzrostu, tj. " + feet + " stóp i " + remainingInches + " cali");
    }
}
