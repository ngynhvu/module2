package array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter element ["+i+"]");
            arr[i] = input.nextInt();
        }
        System.out.println("Array: ");
        System.out.println(Arrays.toString(arr));
        int min = findMin(arr);
        System.out.println("Array's min: "+min);
    }
    static int findMin(int[] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
