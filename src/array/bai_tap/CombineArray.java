package array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] array = new int[arr1.length+arr2.length];
        int[] arr3 = {1, 1, 1, 1};
        int[] arr4 = {2, 2, 2};
        int[] array2 = new int[arr3.length+arr4.length];
        System.out.println("Array1: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Array2: ");
        System.out.println(Arrays.toString(arr2));
        combineArray(arr1, arr2, array);
        System.out.println("Combine Array1 and Array2: ");
        System.out.println(Arrays.toString(array));
        combineArray(arr3, arr4, array2);
        System.out.println(Arrays.toString(array2));
    }
    static void combineArray(int[] arr1, int[] arr2, int[] array){
        int n = arr1.length;
        for(int i=0; i<arr1.length;i++){
            array[i] = arr1[i];
        }
        for(int i=0; i<arr2.length; i++){
            array[n+i] = arr2[i];
        }
    }
}
