package ex1astudent;


public class app {

    public static void main(String[] args) {
        SingleLinkedQueue q = new SingleLinkedQueue<>();

        // Testing method; add()
        System.out.println("---------------ADD-----------------");
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println();
        System.out.println("Queue size: " + q.queueSize);

        // Testing method; remove()
        System.out.println("---------------REMOVE-----------------");
        q.remove();
        System.out.println("Queue size: " + q.queueSize);

        // Testing method; element()
        System.out.println("---------------ELEMENT-----------------");
        System.out.println("Element: " + q.element());

        System.out.println("Queue size: " + q.queueSize);

        // Testing method; clear()
        System.out.println("---------------CLEAR-----------------");
        System.out.println("Queue size before clear: " + q.queueSize);
        q.clear();
        System.out.println("Queue size after clear: " + q.queueSize);
    }
}
