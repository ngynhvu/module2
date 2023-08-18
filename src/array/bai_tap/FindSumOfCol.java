package array.bai_tap;

import java.util.Scanner;

public class FindSumOfCol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array;
        System.out.println("Enter row of array: ");
        int row = scanner.nextInt();
        System.out.println("Enter col of array: ");
        int col = scanner.nextInt();
        array = new int[row][col];
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.println("Enter element at index ["+i+"]["+j+"]");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Array2d: ");
        for(int i=0; i<array.length; i++){
            System.out.print("[ ");
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println("]");
            System.out.println();
        }
        System.out.println("Enter column you want to find sum:");
        int n = scanner.nextInt();
        System.out.println("Sum of column "+n);
        int sum = sum(array, n);
        System.out.println(sum);
    }
    static int sum(int[][] array, int n){
        int sum = 0;
        for(int i=0;i< array.length;i++){
            if(n > array[i].length-1){
                System.out.println("Not found");
                break;
            }
            sum += array[i][n];
        }
        return sum ;
    }
}
