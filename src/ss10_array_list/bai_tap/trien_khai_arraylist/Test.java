package ss10_array_list.bai_tap.trien_khai_arraylist;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<Integer>(20);
        arrayList.add(0,1);
        arrayList.add(1,2);
        arrayList.add(2,3);
        arrayList.add(3,4);
        arrayList.add(1,1);
        System.out.println(Arrays.toString(arrayList.elements));
    }
}
