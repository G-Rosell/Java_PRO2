package exc01;

public class SortedLinkedList {
    // TODO: choose relevant fields
    private Node first;
    private int size;

    public SortedLinkedList() {
        // TODO
        this.first = null;
        this.size = 0;
    }

    /**
     * Add the element to the list.
     * The list is still sorted after the element is added.
     */
//    public void add(String element) {
//        // TODO
//        Node newNode = new Node(element);
//        if (first == null) { // guard: if list is empty, then it will add the new node as the head of the list and increment the size.
//            first = newNode;
//            size++;
//            return;
//        }
//        Node current = first;
//        Node previous = null;
//        while (current != null && current.data.compareTo(element) < 0){ // This guard is checking that the current node is not null and
//            previous = current;                                         // that the current node's data is less than the new element that is being added.
//            current = current.next;                                     // This ensures that the element is being inserted in the correct location in the sorted list.
//        }
//        if (previous == null) {
//            newNode.next = first;
//            first = newNode;
//        } else {
//            previous.next = newNode;
//            newNode.next = current;
//        }
//        size++;
//    }

    /**
     * laver lortet om fordi jeg åbenbart ikke må have previous node ffs
     */

    public void add(String element) {
        Node newNode = new Node(element);
        // Guard: Check if the list is empty
        if (first == null) {
            first = newNode;
            size++;
            return;
        }
        Node current = first;
        // Guard: Check if new element is less than the head of the list
        if (current.data.compareTo(element) > 0) {
            newNode.next = first;
            first = newNode;
            size++;
            return;
        }

        while (current.next != null) {
            // Guard: Check if new element is less than the next element
            if (current.next.data.compareTo(element) > 0) {
                newNode.next = current.next;
                current.next = newNode;
                size++;
                return;
            }
            current = current.next;
        }
        current.next = newNode;
        size++;
    }

    /**
     * Remove the last element from the list.
     * The list is still sorted after the element is removed.
     * Return true, if the element was removed, otherwise false.
     */
    public boolean removeLast(){
        // TODO
        if (first == null) { // guard: if list is empty, return false as there is no element to remove.
            return false;
        }
        if (first.next == null) { // guard: is checking if there is only one element in the list,
            first = null;         // if it is then it will remove the head and decrement the size.
            size--;
            return true;
        }
        Node current = first;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
        return true;
    }
    /**
     * Remove the first instance of the element from the list.
     * The list is still sorted after the element is removed.
     * Return true, if the element was removed, otherwise false.
     */
    public boolean remove(String element){
        // TODO
        if (first == null) { // guard: if list is empty, return false as there is no element to remove.
            return false;
        }
        if (first.data.equals(element)) { // guard: is checking if the head of the list is the element that we want to remove,
            first = first.next;           // if it is, then it will remove the head and decrement the size.
            size--;
            return true;
        }
        Node current = first;
        while (current.next != null && !current.next.data.equals(element)) { // guard: is checking that the current.next is not null,
            current = current.next;                                          // and the current.next.data is not equal to the element that we want to remove.
        }
        if (current.next == null) { // guard: is checking if the current.next is null,
            return false;           // then it will return false as the element that we want to remove is not in the list.
        }
        current.next = current.next.next;
        size--;
        return true;
    }

    /**
     * Print all elements in alphabetical order.
     */
    public void printElements() {
        // TODO
        Node current = first;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    /**
     * Return the count of elements in the list.
     */
    public int count() {
        // TODO
        return size;
    }

    private class Node {
        private String data;
        private Node next;
        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    // /**
    // * These guards ensure that the code does not throw an exception,
    //   when the list is empty or when the element to be removed is not found.
    // */
}