package exc02;

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


    }
}
