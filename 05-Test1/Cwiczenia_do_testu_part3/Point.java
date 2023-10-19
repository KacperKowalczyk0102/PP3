public class Point {
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public boolean isX(){
        return this.x==0;
    }
    public boolean isY(){
        return this.y==0;
    }
    public String toString(){
        return "P("+this.x+","+ this.y+")";
    }
    public static void main(String[] args) {
        Point p = new Point(10, 0);
        System.out.println(p.isX());
        System.out.println(p.isY());
    }   
}
