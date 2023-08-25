package ss6_extends.baitap.circle_cylinder;

public class Circle {
    private int r;
    private String color = "green";
    Circle(){}
    Circle(int r, String color){
        this.r = r;
        this.color= color;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", color='" + color + '\'' +
                '}';
    }
}
