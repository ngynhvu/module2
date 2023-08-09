package array;

import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] array;
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Array's size: ");
        size = input.nextInt();
        array = new int[size];
        for(int i=0; i < array.length; i++){
            System.out.println("Enter element"+"["+i+"]:");
            array[i] = input.nextInt();
        }
        System.out.println("Array[] = ");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]+"\t");
        }
        System.out.println("Array.reverse() = ");
        for(int i=0; i<array.length/2; i++){
            int a = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = a;
        }
        for(int i=0; i<array.length; i++) {
            System.out.println(array[i] + "\t");
        }
    }
}
