package ss6_extends.baitap.circle_cylinder;

public class Cylinder extends Circle{
    private int h = 10;
    Cylinder(int r, String color, int h){
    super(r, color);
    this.h = h;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    public double getVolume(){
        return getR()*getR()*h*Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "h=" + h +
                '}'+super.toString();
    }
}
