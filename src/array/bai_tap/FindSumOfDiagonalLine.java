package array.bai_tap;

import java.util.Scanner;

public class FindSumOfDiagonalLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array2d;
        System.out.println("Enter rows of Array: ");
        int row = input.nextInt();
        System.out.println("Enter columns of Array: ");
        int col = input.nextInt();
        array2d = new int[row][col];
        for(int i=0; i<array2d.length; i++){
            for(int j=0; j<array2d[i].length; j++){
                System.out.println("Enter element at index ["+i+"]["+j+"]");
                array2d[i][j] = input.nextInt();
            }
        }
        System.out.println("Array: ");
        for(int i=0; i<array2d.length; i++){
            for(int j=0; j<array2d[i].length; j++){
                System.out.print(array2d[i][j]);
            }
            System.out.println();
        }
        System.out.println("Sum :");
        int sum =sum(array2d);
        System.out.println(sum);
    }
    static int sum(int[][] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(i == j){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}

