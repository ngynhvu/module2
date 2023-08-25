package ss5.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(1.0, "red");
        System.out.println(c1.getRadius());
        System.out.println(c1.getColor());

    }
}
