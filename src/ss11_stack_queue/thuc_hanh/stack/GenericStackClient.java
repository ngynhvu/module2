package ss11_stack_queue.thuc_hanh.stack;

import java.util.LinkedList;
import java.util.List;

public class GenericStackClient {
    private static  void stackOfIStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: "+ stack.size());
        System.out.println("1.2 Pop elements from stack: ");
        while ((!stack.isEmpty())){
            System.out.println("%s"+ stack.pop());
        }
        System.out.println("\n1.3 Size of stack after pop operations: "+stack.size());
    }
    private static void stackOfInteger(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println();
        System.out.println("1.1 Size of stack after push operations: "+ stack.size());
        System.out.println("1.2 Pop elements from stack: ");
        while ((!stack.isEmpty())){
            System.out.println("%s"+ stack.pop());
        }
        System.out.println("\n1.3 Size of stack after pop operations: "+stack.size());
    }
    public static void main(String[] args) {
        System.out.println("1. Stack of Integers");
        stackOfInteger();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}
