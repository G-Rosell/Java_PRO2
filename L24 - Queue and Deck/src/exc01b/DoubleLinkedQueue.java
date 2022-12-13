package exc01b;

import java.util.NoSuchElementException;

public class DoubleLinkedQueue<E> implements QueueI<E> {

    private Node head;
    private Node tail;
    private int size = 0;

    public DoubleLinkedQueue(){
        head = new Node(null);
        tail = new Node(null);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    // --------------------------------------------------------------------- //

    /**
     * Add a new entry to the back of the queue.
     */
    @Override
    public void add(E entry) {
        Node newNode = new Node(entry);
        newNode.next = head.next;
        newNode.prev = head;
        head.next.prev = newNode;
        head.next = newNode;
        size++;
        System.out.println("Element " + entry + " added to the queue");
    }

    /**
     * Remove and return the entry at the front of the queue.
     * Throw a NoSuchElementException(), if the queue is empty.
     */
    @Override
    public E remove() {
        if (head == tail) { // Sentinel
            throw new NoSuchElementException();
        }
        E removed = head.next.entry;
        head.next = head.next.next;
        head.next.prev = head;
        size--;
        return removed;
    }

    /**
     * Return the entry at the front of the queue.
     * Throw a NoSuchElementException(), if the queue is empty.
     */
    @Override
    public E element() {
        if (head == tail) {
            throw new NoSuchElementException();
        }
        return head.next.entry;
    }

    /**
     * Return true, if the queue is empty.
     */
    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    /**
     * Remove all entries from this queue.
     */
    @Override
    public void clear() {
        if (size > 0)  {
            head.next = tail;
            tail.prev = head;
            size = 0;
        }
    }

    /**
     * Return the number of elements in the queue.
     */
    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        Node node = head.next;
        StringBuilder sb = new StringBuilder();
        while (node != tail){
            sb.append(node.entry.toString()).append("\n");
            node = node.next;
        }
        if (sb.toString().equals("")){
            sb.append("Empty.");
        }
        return sb.toString();
    }

//    public void printNodes(){
//        Node newNode = head;
//        if (head == null) {
//            System.out.println("list is empty");
//            return;
//        }
//        System.out.println("nodes of list:");
//        while (newNode != null){
//            System.out.println(newNode.data + " ");
//            newNode = newNode.next;
//        }
//    }

    // --------------------------------------------------------------------- //

    private class Node {
        private E entry;
        private Node next;
        private Node prev;

        public Node(E entry) {
            this.entry = entry;
            this.next = next;
            this.prev = prev;
        }
    }
}