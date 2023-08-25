package ss6_extends.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Test {
    public static void main(String[] args) {
//        Shape shape = new Shape();
//        System.out.println(shape);
//        shape = new Shape("red", false);
//        System.out.println(shape);
//        Circle circle = new Circle();
//        System.out.println(circle);
//        System.out.println(circle.color);
//        circle = new Circle(3.5);
//        System.out.println(circle);
//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);
//        circle.setColor("yellow");
//        System.out.println(circle.getColor());
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
    }
}
