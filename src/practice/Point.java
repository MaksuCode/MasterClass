package practice;

public class Point {

    private int x ;
    private int y ;

    public Point() {
        this(0,0) ;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance (){
        int sqrt = (x * x) + (y * y) ;
        return Math.sqrt(sqrt);
    }


    public double distance (int x2 , int y2){
        int sqrt = ((x2 - x) * (x2 - x)) + ((y2 - y) * (y2 - y));
        return Math.sqrt(sqrt) ;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}
