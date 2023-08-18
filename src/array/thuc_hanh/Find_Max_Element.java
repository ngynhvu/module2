package array.thuc_hanh;

import java.util.Scanner;

public class Find_Max_Element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        int array_size;
        System.out.println("Enter array_size");
        array_size = input.nextInt();
        array = new int[array_size];
        for(int i = 0; i < array.length; i++ ){
            System.out.println("Enter element at index "+"["+i+"]");
            array[i] = input.nextInt();
        }
        int max = 0;
        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("The max element is: "+ max);
    }
}
