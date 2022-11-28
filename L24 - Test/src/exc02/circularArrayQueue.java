package exc02;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class circularArrayQueue<E> implements QueueI<E> {

    private Object[] elements;
    private int currentSize;
    private int head;
    private int tail;

    /**
     * Constructs an empty queue.
     */

    public circularArrayQueue(){
        final int initial_Size = 5;
        elements = new Object[initial_Size];
        currentSize = 0;
        head = 0;
        tail = 0;
    }



    // ------------------------------------------------------------------------------------------------------------- //



    @Override
    public void add(E entry) {
        growIfNecessary();
        currentSize++;
        elements[tail] = entry;
        tail = (tail + 1) % elements.length;
    }

    private void growIfNecessary(){
        if (currentSize == elements.length){
            Object[] newElements = new Object[2 * elements.length];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[(head + i) % elements.length];
            }
            elements = newElements;
            head = 0;
            tail = currentSize;
        }
    }

    @Override
    public E remove() {
        if (currentSize == 0){
            throw new NoSuchElementException();
        }
        E removed = (E) elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        currentSize--;
        return (E) removed;
    }

    @Override
    public E element() {
        return (E) Array.get(elements, head);
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public void clear() {
        for (int i = elements.length - 1; i > 0; i--){
            Array.set(elements,i, null);
        }
        head = 0;
        tail = 0;
        currentSize = 0;
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < elements.length; i++) {
            if (Array.get(elements,i) != null){
                sb.append(Array.get(elements,i)).append(", ");
            }

        }
        return sb.toString();
    }
}
