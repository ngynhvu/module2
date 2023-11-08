package ss7_abstract_interface.bai_tap.interface_resizeable;

import ss6_extends.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;

public class Rectangle extends Shape implements Resizeable {
    double width = 1.0;
    double length = 1.0;
    public Rectangle(){}

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public void resize(double percent) {
        width = width * percent;
        length = length * percent;
    }
}
