package ex1student;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class DequeStack<E> implements StackI<E> {
    // Implements a stack by adapting a deque (implemented with a LinkedList).
    // The top of the stack is at the beginning (first end) of the deque.

    private final Deque<E> deque;

    public DequeStack() {
        deque = new LinkedList<>();
    }

    /**
     * Adds a new entry to the top of this stack.
     */
    @Override
    public void push(E entry) {
        deque.push(entry);
    }

    /**
     * Removes and returns this stack's top entry.
     * Throws NoSuchElementException, if the stack is empty.
     */
    @Override
    public E pop() {
        // TODO
        if (deque.isEmpty()) {
            throw new NoSuchElementException();
        }
        deque.removeLast();
        return null;
    }

    /**
     * Returns the stack's top entry.
     * Throws NoSuchElementException, if the stack is empty.
     */
    @Override
    public E peek() {
        // TODO
        if (deque.isEmpty()) {
            throw new NoSuchElementException();
        }
        return deque.peek();
    }

    /**
     * Returns true if the stack is empty.
     */
    @Override
    public boolean isEmpty() {
        // TODO
        boolean b = false;
        if (deque.peekFirst() == null){
            b = true;
        }
        return b;
    }
    /**
     * Removes all entries from the stack.
     */
    @Override
    public void clear() {
        // TODO
        while (!isEmpty()) {
            deque.removeLast();
        }
    }
    /**
     * Returns the number of elements in the stack.
     */
    @Override
    public int size() {
        // TODO
        return deque.size();
    }
}
