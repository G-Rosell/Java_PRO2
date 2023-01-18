package exc02;

public class SortedDoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SortedDoublyLinkedList() {
        this.head = new Node(null);
        this.tail = new Node(null);
        this.head.next = tail;
        this.tail.prev = head;
        this.size = 0;
    }

    public void add(String element) {
        Node newNode = new Node(element);
        Node current = head.next;
        // Sentinel: Start from the first element of the list (head sentinel)
        // Guard: Check if the element should be inserted before the current node
        while (current != tail && current.data.compareTo(element) < 0) {
            current = current.next;
        }
        newNode.prev = current.prev;
        newNode.next = current;
        current.prev.next = newNode;
        current.prev = newNode;
        size++;
    }

    public boolean removeLast() {
        // Sentinel: Check if the list is empty (tail sentinel)
        if (tail.prev == head) {
            return false;
        }
        tail.prev = tail.prev.prev;
        tail.prev.next = tail;
        size--;
        return true;
    }

    public boolean remove(String element) {
        Node current = head.next;
        // Sentinel: Start from the first element of the list (head sentinel)
        // Guard: Check if the current element is the element to be removed
        while (current != tail && !current.data.equals(element)) {
            current = current.next;
        }
        // Guard: Check if the element is not in the list
        if (current == tail) {
            return false;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
        return true;
    }
    public void printElements() {
        Node current = head.next;
        while (current != tail) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int count() {
        return size;
    }

    private class Node {
        private String data;
        private Node prev;
        private Node next;

        public Node(String data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
}
