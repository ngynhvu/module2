package ss14_exception_debug.thuc_hanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[10];
        System.out.println("Danh sach phan tu cua mang: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = rd.nextInt(10);
            System.out.println(arr[i]+" ");
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        System.out.println("Vui long nhap so cua mot phan tu bat ky: ");
        int x = Integer.parseInt(sc.nextLine());
        try{
            System.out.println("Gia tri cua phan tu co chi so "+x+" la "+arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Chi so vuot qua gioi han cua mang");
            e.printStackTrace();
        }
    }
}
