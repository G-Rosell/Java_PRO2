package exc03;

public class app {
    public static void main(String[] args) {
        DequeI<String> q = new DoubleLinkedDeque<>();
        // Testing method; add()
        System.out.println("---------------ADD-----------------");
        q.addFirst("Makker 1");
        q.addFirst("Makker 2");
        q.addLast("Makker 3");
        q.addLast("Makker 4");
        q.addFirst("Makker 5");
        q.addLast("Makker 6");
        System.out.println("Printing deque: " + q);

        // Testing method; remove()
        System.out.println("---------------REMOVE: FIRST & LAST-----------------");
        System.out.println(q.removeFirst());
        System.out.println(q.removeFirst());
        System.out.println(q.removeLast());
        System.out.println();
        System.out.println("Printing deque: " + q);
        System.out.println(q.removeLast());
        System.out.println(q.removeFirst());
        System.out.println(q.removeLast());
        System.out.println();
        System.out.println(q);
    }
}