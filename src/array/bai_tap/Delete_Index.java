package array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Delete_Index {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 3, 4, 5, 6, 7, 5};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = input.nextInt();
        System.out.println("Before deleting");
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length ; i++){
            int index = findIndex(array, x);
            if(index == -1){
                System.out.println("Not found");
                System.out.println(Arrays.toString(array));
                break;
            }
            else {
                for(int j = index; j<array.length-1; j++){
                    array[j] = array[j+1];
                }
                array[array.length-1] = 0;
            }

        }
        System.out.println("After deleting");
        System.out.println(Arrays.toString(array));


    }
    static int findIndex(int[] arr, int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}
