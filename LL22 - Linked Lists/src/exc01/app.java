package exc01;

public class app {

    public static void main(String[] args) {
        String paris = "Paris";
        String rom = "Rom";
        String berlin = "Berlin";
        String amsterdam = "Amsterdam";
        String københavn = "København";
        String oslo = "Oslo";
        String ko = "Ko";

        SortedLinkedList list = new SortedLinkedList();

        // ------------------------------------------------------

        // Tester metode; add
       list.add(paris);
       list.add(rom);
       list.add(berlin);
       list.add(amsterdam);
       list.add(københavn);
       list.add(oslo);
       list.add(ko);

        // Tester metode; printElements
        System.out.println("----------------------");
        list.printElements();

        // Tester metode; removeLast
        System.out.println("----------------------");
        System.out.println(list.removeLast());

        // Tester metode; count
        System.out.println("----------------------");
        System.out.println(list.count());
        list.remove(ko);
        list.printElements();
        System.out.println(list.count());
        System.out.println();
        list.add("Tokyo");
        list.printElements();
        System.out.println(list.count());

        System.out.println("----------------------");
        System.out.println("siuuuuuuuuuuuuuuuuuuuuuu");
    }
}
