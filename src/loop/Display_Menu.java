package loop;

import java.util.Scanner;

public class Display_Menu {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Print Rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Rectangle");
                for(int i=1;i<4;i++){
                    System.out.println("\n");
                    for( int j=1 ; j<7 ; j++){
                        System.out.println("*");
                    }
                }
                break;
            case 2:
                System.out.println("top-left square triangle");
                for(int i=1; i <6 ; i++){
                    System.out.println("\n");
                    for(int j=5 ; j>=1; j++){
                        System.out.println("*");
                    }
                }
                System.out.println("top-right square triangle");
                for(int i=1; i<6; i++){
                    System.out.println("\n");

                }
        }
    }
}
