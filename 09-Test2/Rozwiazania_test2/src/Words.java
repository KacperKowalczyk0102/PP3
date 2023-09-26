public class Words {

    private String[] word;
    Words(String [] word){
        this.word = word;
    }

    public boolean m() {
        for (String string : word) {
            int count = 0;
            for (String string2 : word) {
                if(string == string2) count++;
            }
            if (count > 1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] w1 = {"university","semestr","student"};
        String[] w2 = {"university","semestr","student","semestr"};
        Words words = new Words(w1);
        Words words2 = new Words(w2);
        System.out.println(words.m());
        System.out.println(words2.m());
    }
}
