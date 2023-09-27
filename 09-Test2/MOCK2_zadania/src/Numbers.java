public class Numbers {
    int num1;
    int num2;
    int num3;
    int num4;
    int num5;

    Numbers(int num1, int num2, int num3, int num4, int num5) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
    }

    public boolean other() {
        int[] array = {num1, num2, num3, num4, num5};
        for (int numer1 : array) {
            int sum = 0;
            for (int numer2 : array) {
                if (numer1 == numer2) {
                    sum++;
                }
            }
                if (sum > 1) {
                    return false;
                }
            }

        return true;
    }

    public static void main(String[] args) {
        Numbers n = new Numbers(1, 2, 2, 4, 5);
        Numbers n2 = new Numbers(1, 2, 3, 4, 5);
        System.out.println(n.other());
        System.out.println(n2.other());
    }
}
