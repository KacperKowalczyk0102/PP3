public class Point {
    int x;
    int y;

    public Point(int x,int y){
        this.x =x;
        this.y = y;
    }
    public boolean isY(){
        return x==0;
    }
    public boolean isX(){
        return y==0;
    }
    public String toString(){
        return "P("+x+","+y+")";
    }

    public static void main(String[] args) {
        Point p1 = new Point(3,0);
        System.out.println(p1.isY());
        System.out.println(p1.isX());
    }

}
