package ss4_class_object.bai_tap.fan;

public class Main {
    public static void main(String[] args) {
        final int slow = 1;
        final int medium = 2;
        final int fast = 3;
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(fast, false, 10, "red");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        fan1.setOn(false);
        System.out.println(fan1.toString());

    }
}
