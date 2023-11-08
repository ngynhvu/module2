package ss11_stack_queue.thuc_hanh.queue;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;
    public MyLinkedListQueue(){
        this.head = null;
        this.tail = null;
    }
    public void enqueue(int key){
        Node temp = new Node(key);
        if(this.tail == null){
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }
}
