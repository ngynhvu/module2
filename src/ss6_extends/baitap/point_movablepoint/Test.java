package ss6_extends.baitap.point_movablepoint;

public class Test {
    public static void main(String[] args) {
        Point p = new Point(2,3);
        System.out.println(p.toString());
        MovablePoint move = new MovablePoint(1,1,2,3);
        System.out.println(move.move());
        Point p1 = new MovablePoint();
        System.out.println(p1.toString());
        p.setX(3);
        System.out.println(p.getX());
    }
}
