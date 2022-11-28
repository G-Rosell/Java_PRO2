package exc01a;

import java.util.NoSuchElementException;

public class SingleLinkedQueue<E> implements QueueI<E> {
    // first points to the node at the front of the queue
    // (= the first node in the singly-linked list)
    private Node first;

    // last points to the node at the back of the queue
    // (= the last node in the singly-linked list)
    private Node last;

    int queueSize;

    public SingleLinkedQueue() {
        first = null;
        last = null;
        queueSize = 0;
    }

    /**
     * Add a new entry to the back of the queue.
     */
    @Override
    public void add(E entry) {
        // TODO
        Node newNode = last;
        last = new Node(entry);
        last.entry = entry;
        last.next = null;
        if (isEmpty())
        {
            first = last;
        }
        else  {
            newNode.next = last;
        }
        queueSize++;
        System.out.println("Element " + entry + " added to the queue");
    }

    /**
     * Remove and return the entry at the front of the queue.
     * Throw a NoSuchElementException(), if the queue is empty.
     */
    @Override
    public E remove() {
        // TODO
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        int data = (int) first.entry;
        first = first.next;

        if (isEmpty())
        {
            last = null;
        }
        queueSize--;
        System.out.println("Element " + data + " removed from the queue");
        return first.entry;
    }

    /**
     * Return the entry at the front of the queue.
     * Throw a NoSuchElementException(), if the queue is empty.
     */
    @Override
    public E element() {
        // TODO
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return first.entry;
    }

    /**
     * Return true, if the queue is empty.
     */
    @Override
    public boolean isEmpty() {
        // TODO
        return queueSize == 0;
    }

    /**
     * Remove all entries from this queue.
     */
    @Override
    public void clear() {
        // TODO
        first = null;
        last = null;
        queueSize = 0;
    }

    /**
     * Return the number of elements in the queue.
     */
    @Override
    public int size() {
        // TODO
        return queueSize;
    }

    @Override
    public String toString() {
        return "Exc01a.SingleLinkedQueue{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }

    //-------------------------------------------------------------------------

    private class Node {
        private E entry;
        private Node next;

        public Node(E entry) {
            this.entry = entry;
        }
    }
}
