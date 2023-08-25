package ss5.bai_tap.access_modifier;

public class Circle {
    private double radius;
    private String color;
    Circle(double r, String color){
        this.radius = r;
        this.color = color;
    }
    Circle(){
        this.radius = 2.0;
        this.color = "blue";

    }
    protected double getRadius(){
        return this.radius;
    }
    protected String getColor(){
        return this.color;
    }
}
