package ss4_class_object.bai_tap.stop_watch;

import java.util.Random;

public class SelectionSort {
    void sort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        StopWatch stopWatch = new StopWatch();
        int arr[] = new int[100000];
        for (int i = 0; i < arr.length-1; i++) {
            Random random = new Random();
            int ranNum = random.nextInt(100000);
            arr[i] = ranNum;
        }
        stopWatch.getStartTime();
        selectionSort.sort(arr);
        System.out.println("After selection sort about: "+stopWatch.getElapsedTime()+" miliseconds");
    }
}
