package array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddIndex {
    public static void main(String[] args) {
        int[] array;
        //so luong phan tu cau array
        int n;
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        size = input.nextInt();
        array = new int[size];
        System.out.println("Enter numbers of element: ");
        n = input.nextInt();
        for(int i = 0; i < n ; i++){
            System.out.println("Enter element at index ["+i+"]");
            array[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Enter an element to add: ");
        int x = input.nextInt();
        n = addIndex(array, x, n, size);
        System.out.println("After adding");
        System.out.println(Arrays.toString(array));
        x = input.nextInt();
        n = addIndex(array, x, n, size);
        System.out.println("After adding 2");
        System.out.println(Arrays.toString(array));

    }
    static int addIndex(int[] arr, int x, int n, int size){
        if(n >= size){
            return n;
        }
        arr[n] = x;
        return n + 1;
    }
}
