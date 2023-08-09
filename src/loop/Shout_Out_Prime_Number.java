package loop;

import java.util.Scanner;

public class Shout_Out_Prime_Number {
    public static void main(String[] args) {
        int q;
        int count = 0;
        int N = 2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter quantity prime numbers:");
        q = input.nextInt();
        while (count < q){
            for(int i = 2; i < N; i++){
                if(N % i == 0) {
                    N++;
                    break;
                }
            }
            System.out.println(N+" ");
            N++;
            count++;
        }
    }
}
