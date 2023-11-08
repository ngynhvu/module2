package ss11_stack_queue.bai_tap.reverse;

import jdk.jshell.Snippet;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayNumber = new int[10];
        System.out.println("ArrayNumbers:");
        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.println("Enter index "+ i);
            arrayNumber[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Before Reverse: \n" + Arrays.toString(arrayNumber));
        reverseNumber(arrayNumber);
        System.out.println("ArrayWords:");
        String[] arrayWord = new String[10];
        for (int i = 0; i < arrayWord.length; i++) {
            System.out.println("Enter index "+i);
            arrayWord[i] = scanner.nextLine();
        }
        System.out.println("Before Reverse: \n"+Arrays.toString(arrayWord));
        reverseWord(arrayWord);
    }
    public static void reverseNumber(int[] arrayNumbers){
        Stack<Integer> stack = new Stack<>();
        for (int i = arrayNumbers.length-1; i > -1 ; i--) {
            stack.push(arrayNumbers[i]);
        }
        System.out.println("After Reverse: \n" + stack);
    }
    public static void reverseWord(String[]arrayWords){
        Stack<String> stack = new Stack<>();
        for (int i = arrayWords.length-1; i > -1 ; i--) {
            stack.push(arrayWords[i]);
        }
        System.out.println("After Reverse: \n" + stack);
    }
}
