package array.thuc_hanh;

import java.util.Scanner;

public class CountStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] array;
        do{
            System.out.println("Enter number of students: ");
            size = input.nextInt();
            if(size>30){
                System.out.println("Over 30 students");
            }
        }while (size>30);
        array = new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("Enter mark of students "+i+1+": ");
            array[i] = input.nextInt();
            i++;
        }
        int count = 0;
        for(i=0;i<array.length;i++){
            if(array[i]>=5 && array[i]<=10){
                count++;
            }
        }
        System.out.println("the number of students passing the exam: "+count);
    }
}
