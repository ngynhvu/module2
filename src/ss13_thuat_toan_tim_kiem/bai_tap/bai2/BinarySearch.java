package ss13_thuat_toan_tim_kiem.bai_tap.bai2;

import java.util.Scanner;

public class BinarySearch {
    static int[] arr = {1 , 3, 33, 43, 53, 22, 78, 99, 10, 20, 119};
    static int binarySearch(int[] arr, int value) {
        sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (right >= left) {
            int middle = (left + right)/2;
            if (value < arr[middle]) {
                right = middle - 1;
            } else if (value == arr[middle]) {
                return middle;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
    static void sort(int[] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i +1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter value: ");
            int value = Integer.parseInt(scanner.nextLine());
            System.out.println(binarySearch(arr, value));
        }
    }
}
