package array.bai_tap;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array;
        System.out.println("Enter size of array:");
        int size = scanner.nextInt();
        array = new String[size];
        System.out.println("Enter string:");
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextLine();
        }
        System.out.println("Array: ");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
