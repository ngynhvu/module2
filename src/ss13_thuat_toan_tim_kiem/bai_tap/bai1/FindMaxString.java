package ss13_thuat_toan_tim_kiem.bai_tap.bai1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FindMaxString {
    public static void findMax(String string){
        LinkedList<Character> max = new  LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        list.add(string.charAt(0));
        for (int i = 1; i < string.length(); i++) {
            if(list.getLast() < string.charAt(i)){
                list.add(string.charAt(i));
            }
        }
        if(list.size() > max.size()){
            max.clear();
            max.addAll(list);
        }
        list.clear();
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter String: ");
            String string = scanner.nextLine();
            findMax(string);
        }
    }
}
