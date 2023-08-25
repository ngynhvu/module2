package ss6_extends.baitap.point2D_point3D;

public class Point2D {
    float x;
    float y;
    Point2D(){}
    Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float[] xy = new float[]{x,y};
        return xy;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "Point2D ("+x+","+y+")";
    }
}
