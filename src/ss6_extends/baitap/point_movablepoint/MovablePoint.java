package ss6_extends.baitap.point_movablepoint;

public class MovablePoint extends Point {
    float xSpeed;
    float ySpeed;
    MovablePoint(){}
    MovablePoint(float x, float y){
        super(x, y);
    }
    MovablePoint(float xSpeed, float ySpeed, float x, float y){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] speed = {xSpeed, ySpeed};
        return speed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
    public void MovablePoint(){
        x += xSpeed;
        y += ySpeed;
    }
}
