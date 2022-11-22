package exc02;


public class SortedDoubleList {
    private Node header;
    private Node trailer;

    public SortedDoubleList(){
        header = new Node(null);
        trailer = new Node(null);
        header.next = trailer;
        trailer.prev = header;
    }

    // --------------------------------------------------------------------- //

    /**
     * Add the element to the list.
     * The list is still sorted after the element is added.
     */

    public void add(String element) {
        Node newNode = new Node(element);
        if (header.next == trailer) { // sentinel // list is empty
            newNode.next = header.next;
            newNode.prev = header;
            header.next = newNode;
            trailer.prev = newNode;
            return;
        }

        Node node = header.next;

        if (node.data.compareTo(element) > 0) {
            newNode.next = node;
            header.next = newNode;
            return;
        }

        if (node.next == trailer) {
            if (node.data.compareTo(element) < 0) {
                node.next = newNode;
            } else if (node.data.compareTo(element) >= 0) {
                newNode.next = node;
                node.prev = newNode;
            }
        }
    }

    /**
     * Remove the last element from the list.
     * The list is still sorted after the element is removed.
     * Return true, if the element was removed, otherwise false.
     */

    public boolean remove(String data) {
        if (header.next == trailer) {
            return false;
        }
        Node node = header;
        while (node.next != trailer && !node.next.data.equals(data)) {
            node = node.next;
        }
        if (node.next != trailer) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            return true;
        }
        return false;
    }

    /**
     * Remove the last element from the list.
     * The list is still sorted after the element is removed.
     * Return true, if the element was removed, otherwise false.
     */

    public boolean removeLast(){
        if(trailer.prev != header){
            trailer.prev = trailer.prev.prev;
            trailer.prev.next = trailer;
            return true;
        }
        return false;
    }

    /**
     * Print all elements in alphabetical order.
     */

    public void printElements() {
        if (header.next == trailer) {
            System.out.println("Empty list");
            return;
        }
        Node node = header.next;
        while (node != trailer){
            System.out.println(node.data);
            node = node.next;
        }
    }

    /**
     * Return the count of elements in the list.
     */

    public int count() {
        int count = 0;
        if(header.next == trailer){
            return 0;
        }

        Node node = header.next;
        while(node != trailer){
            count++;
            node = node.next;
        }
        return count;
    }


    // --------------------------------------------------------------------- //

    private class Node {
        private String data;
        private Node next;
        private Node prev;

        public Node(String data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}
