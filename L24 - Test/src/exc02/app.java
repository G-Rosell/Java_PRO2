package exc02;

import java.sql.SQLOutput;

public class app {
    public static void main(String[] args) {

        circularArrayQueue circularArrayQueue = new circularArrayQueue<>();
        // -------------------------------------------------------------------------------------------------------------

        // Testing method; add() --> higher than set-capacity to test extendQueue
        int queueCount = 10;
        for (int i = 1; i <= queueCount; i++) {
            circularArrayQueue.add(i);
        }
        System.out.println("-------------------------------------");
        System.out.println("Testing add method:");
        System.out.println();
        System.out.println("Printing queue...\n" + circularArrayQueue);
        System.out.println("-------------------------------------");

        // Testing method; remove()
        System.out.println("Testing remove method:");
        System.out.println();
        System.out.println("Size before removing: " + circularArrayQueue.size());
        circularArrayQueue.remove();
        System.out.println("Removing...");
        System.out.println(circularArrayQueue);
        System.out.println("Size after removing: " + circularArrayQueue.size());
        System.out.println("-------------------------------------");

        // Testing method; element()
        System.out.println("Testing element method:");
        System.out.println();
        circularArrayQueue.add(11);
        System.out.println(circularArrayQueue);
        System.out.println("First entry at the front of the queue: " + circularArrayQueue.element());
        System.out.println("-------------------------------------");
        // Testing method; isEmpty()
        System.out.println("Returns true if list is empty: " + circularArrayQueue.isEmpty());
        System.out.println("-------------------------------------");

        // Testing method; clear()
        System.out.println("Testing clear method:");
        System.out.println();
        System.out.println("Before clear: " + circularArrayQueue.size());
        circularArrayQueue.clear();
        System.out.println("After clear: " + circularArrayQueue.size());
        System.out.println("-------------------------------------");

        // Testing method; size()
        System.out.println("Testing size method:");
        System.out.println();
        System.out.println("Current list size: " + circularArrayQueue.size());
        System.out.println("-------------------------------------");
    }
}
