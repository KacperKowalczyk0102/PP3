public class SuperCounter extends Counter {
    SuperCounter(int initcounter){
        super(initcounter);
    }
    public void addM(int n){
        for(int i=0; i <n; i++){
            add1();
        }
    }

    public static void main(String[] args) {
        SuperCounter c1 = new SuperCounter(10);
        System.out.println(c1.getCounter());
        c1.add1();
        System.out.println(c1.getCounter());
        c1.addM(10);
        System.out.println(c1.getCounter());
    }
}
