package exc02;

import java.util.function.Predicate;

public class app {

    public static void main(String[] args) {
        String paris = "Paris";
        String rom = "Rom";
        String berlin = "Berlin";
        String amsterdam = "Amsterdam";
        String copenhagen = "Copenhagen";
        String oslo = "Oslo";
        String ko = "Ko";

        SortedDoubleList list = new SortedDoubleList();

        // --------------------------------------------------------------------- //

        // Tester metode; add
        list.add(paris);
        list.add(rom);
        list.add(berlin);
        list.add(amsterdam);
        list.add(copenhagen);
        list.add(oslo);
        list.add(ko);

        list.printElements();
        System.out.println();
        System.out.println("Count: " + list.count());
        System.out.println();
        System.out.println("--------------");
        System.out.println();

        // Remove last og remove virker ikke

        System.out.println("Remove last:");
        System.out.println(list.removeLast());
        list.printElements();


        System.out.println("Remove ko:");
        System.out.println();
        list.remove(ko);
        list.printElements();
        System.out.println("shits not working");




    }
}
