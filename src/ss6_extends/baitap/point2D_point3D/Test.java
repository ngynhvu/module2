package ss6_extends.baitap.point2D_point3D;

public class Test {
    public static void main(String[] args) {
        Point2D p2d = new Point2D(1,2);
        System.out.println(p2d.toString());
        Point3D p3d = new Point3D(2,3,4);
        System.out.println(p3d.toString());
        Point2D p = new Point3D();
        System.out.println(p.toString());
    }
}
