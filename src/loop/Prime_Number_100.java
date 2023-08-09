package loop;

import java.util.Scanner;

public class Prime_Number_100 {
    public static void main(String[] args) {
        int N = 2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter quantity prime numbers:");
        N = input.nextInt();
        while (N < 100 && N > 1){
            for(int i = 2; i < N; i++){
                if(N % i == 0) {
                    N++;
                    break;
                }
            }
            System.out.println(N+" ");
            N++;
        }
    }
}

