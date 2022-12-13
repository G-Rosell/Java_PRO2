package ex2student;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSetSC implements a hash set using separate chaining.
 * Note: null is not allowed as an element in the set.
 */
public class HashSetSC<E> {
    // the hash table where each entry contains
    // a collection of elements with the same hash value;
    // collections are implemented as a single linked lists
    private Node<E>[] table;
    // the number of elements in the hash set
    private int size;

    private static final double maxLoadFactor = 0.7;

    /**
     * Create a new HashSetSC with the given table length.
     * Note: The table length must be a prime number.
     */
    public HashSetSC(int tableLength) {
        @SuppressWarnings("unchecked")
        Node<E>[] emptyTable = (Node<E>[]) new Node[tableLength];
        table = emptyTable;
        size = 0;
    }

    private int hash(E element) {
        int h = element.hashCode();
        if (h < 0) h = -h;
        h = h % table.length;
        return h;
    }

    /**
     * Return true, if element is in the set.
     */
    public boolean contains(E element) {
        // TODO
        int h = hash(element);
        Node current = table[h];
        while (current != null) {
            if (current.data.equals(element)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Add element to this set.
     * Return true, if the element is added to the set.
     * Throw IllegalArgumentException, if element is null.
     */
    public boolean add(E element) {
        // TODO
        if (element == null) {
            throw new IllegalArgumentException();
        } else if (!contains(element)){
            int h = hash(element);
            Node newNode = new Node<>(element);
            table[h] = newNode;
            size++;
            System.out.println("Element " + newNode + " added");
            return true;
        }
        // resize if necessary
        if (loadFactor() > maxLoadFactor) {
            rehash();
        }

        return false;
    }

    /**
     * Remove element from the set.
     * Return true, if the element is removed from the set.
     */
    public boolean remove(E element) {
        // TODO
        int h = hash(element);

        if (table[h] != null) {
            if (table[h].data.equals(element)){
                table[h] = table[h].next;
            }else {
                Node current = table[h];
                while (current.next != null && !current.next.data.equals(element)){
                    current = current.next;
                }
                if (current.next != null) {
                    current.next = current.next.next;
                }
            }
            return true;
        }
        return false;
    }

    /**
     * Return the number of elements in this set.
     */
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        // TODO
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            Node<E> node = table[i];
            while (node != null) {
                sb.append(table[i].data + ", full list is:" + node.data).append("\n");
                node = node.next;
            }
        }
        return sb.toString();
    }

    // makkeren prøver lige at rehashe

    // Returns the hash table's "load factor", its ratio of size to capacity.
    public double loadFactor() {
        return (double) size / table.length;
    }

    // Resizes the hash table to twice its original capacity.
    @SuppressWarnings("unchecked")
    private void rehash() {
        Node<E>[] newElements = (Node<E>[]) new Node[2 * table.length];
        Node[] old = table;
        table = newElements;
        size = 0;
        for (Node node : old) {
            while (node != null) {
                add((E) node.data);
                node = node.next;
            }
        }
    }
    //-------------------------------------------------------------------------

    private static class Node<T> {
        private final T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }
//
//    public Iterator iterator(){
//        return new HashSetIterator();
//    }
//
//    private static class HashSetIterator implements Iterator {
//        private int bucketIndex;
//        private Node current;
//
//        public HashSetIterator(){
//            bucketIndex = -1;
//            current = null;
//        }
//
//        @Override
//        public boolean hasNext() {
//            if (current != null && current.next != null){
//                return true;
//            }
//            for (int b = bucketIndex + 1; b < )
//            return false;
//        }
//
//        @Override
//        public Object next() {
//            return null;
//        }
//    }


}
