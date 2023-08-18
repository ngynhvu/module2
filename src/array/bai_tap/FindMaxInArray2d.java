package array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInArray2d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int row = input.nextInt();
        System.out.println("Enter cols: ");
        int col = input.nextInt();
        int[][] array2d = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<array2d[i].length; j++) {
                System.out.println("Enter element at index [" + i + "][" + j + "]");
                array2d[i][j] = input.nextInt();
            }
        }
//        System.out.println("Array2d: ");
//        System.out.println(Arrays.toString(Arrays.toString(array2d)));
        for(int i=0; i<row ; i++){
            System.out.println("[");
            for(int j=0; j<col; j++){
                System.out.println(array2d[i][j]+" ");
            }
            System.out.println("]");
            System.out.println("\n");
        }
        int max = findMax(array2d);
        System.out.println("Max: ");
        System.out.println(max);
    }
    static int findMax(int[][] arr){
        int max = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
