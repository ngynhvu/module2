package ss7_abstract_interface.bai_tap.interface_resizeable;

import ss6_extends.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius * Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public void resize(double percent) {
        this.radius = percent*radius;
    }
}
