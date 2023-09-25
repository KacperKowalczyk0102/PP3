public class Point {
    int x;
    int y;

    Point(int x , int y){
        this.x = x;
        this.y = y;
    }
    public boolean isY(){
        return x==0;
    }
    public boolean isX(){
        return y==0;
    }
    public String toString(){
        return "P("+ this.x+ ","+this.y+")";

    }

    public static void main(String[] args) {
        Point point = new Point(3,0);
        System.out.println(point.isY());
        System.out.println(point.isX());
        System.out.println(point.toString());
    }
}
