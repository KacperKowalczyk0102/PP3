public class Point {
    public int x;
    public int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isX() {
        return this.x==0;
    }
    public boolean isY(){
        return this.x==0;
    }
    public String toString(){
        return "P("+this.x+","+this.y+")";
    }

}