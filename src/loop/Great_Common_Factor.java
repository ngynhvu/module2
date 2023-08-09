package loop;

import java.util.Scanner;

public class Great_Common_Factor {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();
        a = Math.abs(a); // giá trị tuyệt dối |a|
        b = Math.abs(b); // giá trị tuyệt dối |b|
        if(a==0 || b==0){
            System.out.println("No great common factor");
        }
        while(a!=b){
            if(a>b){
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        System.out.println("Great common factor: " + a);
    }
}
