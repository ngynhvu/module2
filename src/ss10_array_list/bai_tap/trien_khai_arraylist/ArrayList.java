package ss10_array_list.bai_tap.trien_khai_arraylist;

import java.util.Arrays;

public class ArrayList <E>{
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];
    ArrayList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    ArrayList(int capacity){
        elements = new Object[capacity];
    }
    private void ensureCapa(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void push(E e){
        if(size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }
    public void add(int index, E element ){
        for(int i=0; i < elements.length; i++){
            if(i == index){
                for(int j=index; j<elements.length - 1; j++){
                    elements[j] = elements[j+1];
                }
                elements[i] = element;
            }
        }
    }
    public E remove(int index) {
        for (int i = 0; i < elements.length - 1; i++) {
            if (i == index) {
                for (int j = i; j < elements.length; j++) {
                    elements[j + 1] = elements[j];
                }
                return (E) elements[i];
            }
        }
        return (E)elements;
    }

}
