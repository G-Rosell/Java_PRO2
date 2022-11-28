package ex01b;

public class DoubleLinkedQueue<E> implements QueueI<E> {

    private Node head;
    private Node tail;
    int size = 0;

    public DoubleLinkedQueue(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // --------------------------------------------------------------------- //

    /**
     * Add a new entry to the back of the queue.
     */
    @Override
    public void add(E entry) {
        Node newNode = new Node(entry);
        if (this.size == 0) { // sentinel
            this.head = newNode;
            this.tail = newNode;
        } else { // sentinel
            this.tail.next = newNode;
            newNode.prev = tail;
            this.tail = newNode;
        }
        size++;
        System.out.println("Element " + entry + " added to the queue");
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return size;
    }


    // --------------------------------------------------------------------- //

    private class Node {
        private String data;
        private Node next;
        private Node prev;

        public Node(E entry) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}