package array.thuc_hanh;

import java.util.Scanner;

public class Convert_Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. exit");
        System.out.println("Enter your choice: ");
        int choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter Fahrenheit:");
                double f = input.nextDouble();
                System.out.println(f +"F = "+ftoC(f)+"C");
                break;
            case 2:
                System.out.println("Enter Celsius");
                double c =input.nextDouble();
                System.out.println(c +"C = "+ctoF(c)+"F");
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("No choice");
        }
    }
    public static double ftoC(double f) {
        double c = (5.0/9)*(f -32);
        return c;
    }
    public  static double ctoF(double c){
        double f = (c*1.8)+32;
        return f;
    }
}
