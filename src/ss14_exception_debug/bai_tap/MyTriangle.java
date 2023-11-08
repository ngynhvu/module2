package ss14_exception_debug.bai_tap;

import ss6_extends.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Triangle;

import java.util.Scanner;

public class MyTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ischeck = false;
        while (!ischeck){
            try {
                System.out.println("Enter a: ");
                int a = Integer.parseInt(sc.nextLine());
                System.out.println("Enter b: ");
                int b = Integer.parseInt(sc.nextLine());
                System.out.println("Enter c: ");
                int c = Integer.parseInt(sc.nextLine());
                ischeck = true;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public MyTriangle(int a, int b, int c) throws IllegalTriangleException {
        if(a > b+c||b>a+c||c>a+b||a>0 && b>0&&c>0){
            throw new IllegalTriangleException("Not triangle");
        }
        System.out.println("That is triangle");
    }
}
