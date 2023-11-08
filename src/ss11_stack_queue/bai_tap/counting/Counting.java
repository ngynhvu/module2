package ss11_stack_queue.bai_tap.counting;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new TreeMap<String, Integer>();
        System.out.println("Enter size of Map: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] values = new int[10];
        String[] keys = new String[10];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Entry: ");
            System.out.println("Key: ");
            keys[i] = scanner.nextLine();
            values[i] = 1;
            map.put(keys[i], values[i]);
        }
        boolean flag = true;
        while (flag){
            String key = scanner.nextLine();
            for (int i = 0; i < n ; i++) {
                if (key == keys[i]){
                    map.remove(keys[i]);
                    map.put(keys[i], ++values[i]);
                }
                else if(keys[i] == null) {
                    keys[i] = key;
                    values[i] = 1;
                    map.put(keys[i],values[1]);
                }
            }
        }
    }
}
