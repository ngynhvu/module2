package oop.bai_tap.ptbac2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap cac he so a,b,c cho pt bac 2: aX^2 + bx + c");
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.println("c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if(quadraticEquation.getDelta() < 0){
            System.out.println("Phuong trinh vo no");
        } else if (quadraticEquation.getDelta() == 0) {
            System.out.println("Phuong trinh co 1 no kep: "+quadraticEquation.getRoot12());
        }else {
            System.out.println("Phuong trinh co 2 no \n x1 = " +
                    quadraticEquation.getRoot1() +
                    "\n x2 = " +
                    quadraticEquation.getRoot2());
        }
    }
}
