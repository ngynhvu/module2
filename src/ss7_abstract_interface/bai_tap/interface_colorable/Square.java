package ss7_abstract_interface.bai_tap.interface_colorable;

import ss6_extends.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;

public class Square extends Shape implements Colorable {
    public int x;
    public Square (int x){
        this.x = x;
    }
    public Square(int x, String color, boolean filled){
        super(color, filled);
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public double getArea(){
        return x*x;
    }

    @Override
    public void howToColor() {
        super.setColor("yellow");
    }
}
