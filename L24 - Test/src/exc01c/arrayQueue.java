package exc01c;

import java.lang.reflect.Array;
import java.util.Iterator;

public class arrayQueue<E> implements QueueI<E> {

    private E[] entries;
    private int head;
    private int tail;
    private int size;

    public arrayQueue(int capacity) {
        E[] temp =  (E[]) new Object[capacity];
        entries = temp;
        head = 0;
        tail = 0;
    }
    // --------------------------------------------------------------------- //
    /**
     * Add a new entry to the back of the queue.
     */
    @Override
    public void add(E entry) {
       if (isEmpty()){
           extendQueueCapacity();
       }
       Array.set(entries, tail, entry);
        System.out.println("Element " + entry + " added");
        tail++;
        size++;
    }
    private void extendQueueCapacity() {
        @SuppressWarnings("unchecked")
        E[] temp = (E[]) new Object[entries.length * 2];
        System.arraycopy(entries, 0, temp, 0, entries.length);
        entries = temp;
    }

    /**
     * Remove and return the entry at the front of the queue.
     * Throw a NoSuchElementException(), if the queue is empty.
     */
    @Override
    public E remove() {
        E temp = (E) Array.get(entries, head);
        Array.set(entries, head, null);
        head++;
        size--;
        return temp;
    }

    /**
     * Return the entry at the front of the queue.
     * Throw a NoSuchElementException(), if the queue is empty.
     */
    @Override
    public E element() {
        return (E) Array.get(entries, head);
    }

    /**
     * Return true, if the queue is empty.
     */
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Remove all entries from this queue.
     */
    @Override
    public void clear() {
        for (int i = entries.length - 1; i > 0; i--){
            Array.set(entries,i, null);
        }
        head = 0;
        tail = 0;
        size = 0;
    }

    /**
     * Return the number of elements in the queue.
     */
    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < entries.length; i++) {
            if (Array.get(entries,i) != null){
                sb.append(Array.get(entries,i)).append(", ");
            }

        }
        return sb.toString();
    }
}
