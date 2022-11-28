package exc01c;

public class app {
    public static void main(String[] args) {

        arrayQueue arrayQueue = new arrayQueue<>(10);
        // -------------------------------------------------------------------------------------------------------------

        // Testing method; add() --> higher than set-capacity to test extendQueue
        int queueCount = 20;
        for (int i = 1; i <= queueCount; i++) {
            arrayQueue.add(i);
        }
        System.out.println();
        System.out.println("Printing queue: " + arrayQueue);
        System.out.println("-------------------------------------");

        // Testing method; remove()
        System.out.println("Size before removing: " + arrayQueue.size());
        arrayQueue.remove();
        System.out.println(arrayQueue);
        System.out.println("Size after removing: " + arrayQueue.size());
        System.out.println("-------------------------------------");

        // Testing method; element()
        System.out.println("First entry at the front of the queue: " + arrayQueue.element());
        System.out.println("-------------------------------------");
        // Testing method; isEmpty()
        System.out.println("Returns true if list is empty: " + arrayQueue.isEmpty());
        System.out.println("-------------------------------------");

        // Testing method; clear()
        System.out.println("Before clear: " + arrayQueue.size());
        arrayQueue.clear();
        System.out.println("After clear: " + arrayQueue.size());
        System.out.println("-------------------------------------");
        // Testing method; size()
        System.out.println("Current list size: " + arrayQueue.size());
        System.out.println("-------------------------------------");
    }
}
