package exc01;

public class CitySortedSingleListDemo {

    public static void main(String[] args) {
        String paris = "Paris";
        String rom = "Rom";
        String berlin = "Berlin";
        String amsterdam = "Amsterdam";
        String københavn = "København";
        String oslo = "Oslo";
        String ko = "Ko";

        CitySortedSingleList list = new CitySortedSingleList();
        list.add(paris);
        list.add(rom);
        list.add(berlin);
        list.add(amsterdam);
        list.add(københavn);
        list.add(oslo);
        list.add(ko);

        list.printElements();
    }
}
