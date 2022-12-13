package exc01b;

public class app {

    public static void main(String[] args) {
        DoubleLinkedQueue pik = new DoubleLinkedQueue<>();
        // -------------------------------------------------------------------------------------------------------------
        System.out.println("-------------------------------------");
        System.out.println("Testing method; add()");
        System.out.println();
        pik.add(1);
        pik.add(2);
        pik.add(3);
        pik.add(4);
        pik.add(5);
        System.out.println();
        System.out.println(pik);
        System.out.println("-------------------------------------");

        System.out.println("Testing method; remove():");
        System.out.println();
        System.out.println("Size before removing:" + pik.size());
        pik.remove();
        System.out.println("Size after removing:" + pik.size());
        System.out.println(pik);
        System.out.println("-------------------------------------");

        System.out.println("Testing method; element():");
        System.out.println();
        System.out.println("First entry at the front of the queue: " + pik.element());
        System.out.println("-------------------------------------");

        System.out.println("Testing method; isEmpty():");
        System.out.println();
        System.out.println("Returns true if list is empty: " + pik.isEmpty());
        System.out.println("-------------------------------------");

        System.out.println("Testing method; clear(): ");
        System.out.println();
        System.out.println("Before clear: " + pik.size());
        pik.clear();
        System.out.println("After clear: " + pik.size());
        System.out.println("-------------------------------------");

        System.out.println("Testing method; size():");
        System.out.println();
        System.out.println("Current list size: " + pik.size());
        System.out.println("-------------------------------------");
    }
}
