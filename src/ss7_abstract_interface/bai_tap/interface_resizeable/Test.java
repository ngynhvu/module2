package ss7_abstract_interface.bai_tap.interface_resizeable;

import ss6_extends.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Shape;

public class Test {
    public static void main(String[] args) {
//        Circle circle = new Circle(20);
//        Rectangle rectangle = new Rectangle(10, 20);
//        System.out.println("Before resize: ");
//        System.out.println("+ Circle:");
//        System.out.println(circle.getArea());
//        System.out.println("+ Rectangle:");
//        System.out.println(rectangle.getArea());
//        circle.resize(Math.random());
//        rectangle.resize(Math.random());
//        System.out.println("After resize:");
//        System.out.println("+ Circle:");
//        System.out.println(circle.getArea());
//        System.out.println("+ Rectangle:");
//        System.out.println(rectangle.getArea());
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(20);
        shapes[1] = new Rectangle(10, 20);
        for(Shape shape : shapes){
            if(shape instanceof Circle){
                Circle circle = (Circle)shape;
                System.out.println("Circle before resize:");
                System.out.println(circle.getArea());
                circle.resize(Math.random());
                System.out.println("Circle after resize:");
                System.out.println(circle.getArea());
            }
        }
    }
}
