package ss7_abstract_interface.bai_tap.interface_colorable;

import ss6_extends.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;
import ss7_abstract_interface.bai_tap.interface_resizeable.Circle;
import ss7_abstract_interface.bai_tap.interface_resizeable.Rectangle;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(10,20);
        shapes[2] = new Square(15);
        for(Shape shape : shapes){
            System.out.println(shape.getArea());
            System.out.println(shape.getColor());
            if(shape instanceof Square){
                System.out.println("Square: ");
                Square square = (Square)shape;
                square.howToColor();
                System.out.println(square.getColor());
            }
        }
    }
}
