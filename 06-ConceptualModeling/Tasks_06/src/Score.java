import java.util.ArrayList;

public class Score {
    private ArrayList<Integer> scores = new ArrayList<Integer>();
    private String playerName;

    public Score(String playerName){
        this.playerName = playerName;
    }
    void addIndywidualScore(int score){
        scores.add(score);
   }
   float scoreMean(){
        int sum = 0;
        for(int score: scores){
            sum+=score;
        }
        return sum/(float) scores.size();
   }
   int[] getMinMax(){
        int min = scores.get(0);
        int max = scores.get(0);
        for(int score: scores){
            if(min<score) min=score;
            if(max>score) max=score;
        }return new int[]{min,max};
   }
   void results(){
        int[]minMax = getMinMax();
       System.out.println("Player: "+ playerName);
       System.out.println("Mean: " + scoreMean());
       System.out.println("Min: "+ minMax[0] + ", Max: "+ minMax[1]);
   }

    public static void main(String[] args) {
        Score s1 = new Score("Kacper");
        Score s2 = new Score("Kacper");

        s1.addIndywidualScore(1);
        s1.addIndywidualScore(2);
        s1.addIndywidualScore(3);
        s1.addIndywidualScore(4);
        s1.addIndywidualScore(5);
       

    }
}
