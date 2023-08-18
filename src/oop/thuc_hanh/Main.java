package oop.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter height");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your rectangle \n"+rectangle.toString());
        System.out.println("Perimeter of the rectangle: "+rectangle.getPerimeter());
        System.out.println("Area of the rectangle: "+rectangle.getArea());
    }
}
