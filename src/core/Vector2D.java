package core;

public class Vector2D {

    private double x;
    private double y;

    public Vector2D(double x,double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double lenght(){
        return Math.sqrt(x*x+y*y);
    }

    public void normalize(){
        double length = lenght();
        x = x ==0 ? 0: x/length;
        y = y ==0 ? 0: y/length;
    }

    public void multiply(double velocity) {
        x*=velocity;
        y*=velocity;
    }

    public double getX() {
        return x;
    }
    public double getY(){
        return y;
    }

}
