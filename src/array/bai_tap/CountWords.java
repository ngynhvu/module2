package array.bai_tap;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array;
        System.out.println("Enter size of array:");
        int size = Integer.parseInt(scanner.nextLine());
        array = new String[size];
        System.out.println("Enter string:");
        for(int i = 0; i < array.length; i++){
            System.out.println("Enter element at index "+i);
            array[i] = scanner.nextLine();
        }
        System.out.println("Array: ");
        System.out.print("[ ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.print("]");
        System.out.println("\n");
        System.out.println("Enter word to find");
        String x = scanner.nextLine();
        int count = findWords(array, x);
        System.out.println(count);
        if(count == 0){
            System.out.println("Not found");
        }
        else {
            System.out.println(x+" appear "+count+" time");
        }

    }
    static int findWords(String[] arr, String x){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }
}
