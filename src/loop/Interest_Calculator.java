package loop;

import java.util.Scanner;

public class Interest_Calculator {
    public static void main(String[] args) {
        int money = 1;
        int month = 1;
        double interest = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount");
        money = scanner.nextInt();
        System.out.println("Enter a number of month");
        month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage");
        interest = scanner.nextDouble();
        double totalInterest = 0;
            for(int i = 0; i < month; i++){
                totalInterest += money +(interest/100)/12 * month;
            }
        System.out.println("Total of interest "+ totalInterest);
    }
}
