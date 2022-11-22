package exc01;

import java.util.NoSuchElementException;

public class CitySortedSingleList {
    private Node first;

    /**
     * Adds an element to the list.
     */
    public void add(String s) {
        Node newNode = new Node(s);
        if (first == null) {
            first = newNode;
            return;
        }

        if (first.element.compareTo(s) > 0) {
            newNode.next = first;
            first = newNode;
            return;
        }

        Node node = first;
        if (node.next == null) {
            if (node.element.compareTo(s) < 0) {
                node.next = newNode;
            } else if (node.element.compareTo(s) > 0) {
                newNode.next = first;
                first = newNode;
            }
            return;
        }
        while (node.next != null && node.next.element.compareTo(s) < 0) {
            node = node.next;
        }
        newNode.next = node.next;
        node.next = newNode;
    }


    /**
     * Removes the first element in the list.
     */

    public boolean removeLast() {
        boolean removed = false;
        if (first == null) {
            throw new NoSuchElementException();
        }

        if (first.next == null) {
            first = null;
            removed = true;
        }

        Node node = first;
        while (node.next.next != null) {
            node = node.next;
            node.next = null;
            removed = true;
        }
            return removed;
    }

    /**
     * Removes the element in the list.
     */
    public boolean remove(String element) {
        boolean removed = false;

        if (first == null) {
            throw new NoSuchElementException();
        }

        if (first.element.equals(element)) {
            first = first.next;
            removed = true;
        }
        Node node = first;
        while (node.next != null && !node.next.equals(element)) {
            node = node.next;
            node.next = null;
            removed = true;
        }
        return removed;
    }


    /**
     * Prints the number of elements in the list.
     */
    public void printElements() {
        Node node = first;
        if (first == null) {
            throw new NoSuchElementException();
        }
        System.out.println(node.element);
        while (node.next != null) {
            node = node.next;
            System.out.println(node.element);
        }
    }

    /**
     * Return the number of ?? in the list.
     */
    public int count() {
        int count = 0;
        Node node = first;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    // -----------------------------------------------------------------------

    private class Node {
        private String element;
        private Node next;
        public Node(String element) {
            this.element = element;
            this.next = null;
        }
    }
}
