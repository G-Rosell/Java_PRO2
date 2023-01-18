package exc02;

public class app {

    public static void main(String[] args) {
        SortedDoublyLinkedList list = new SortedDoublyLinkedList();
        list.add("skrr skrr");
        list.add("siuuu");
        list.add("i like it picasso");
        list.add("wroom wroom");
        list.printElements();
        System.out.println("Size: " + list.count()); // Prints: "Size: 4"

        list.remove("banana");
        list.printElements();
        System.out.println("Size: " + list.count()); // Prints: "Size: 3"

        list.removeLast();
        list.printElements();
        System.out.println("Size: " + list.count()); // Prints: "Size: 2"

        boolean removed = list.remove("fisse");
        if (!removed) {
            System.out.println("Element not found");
        }
    }

}
