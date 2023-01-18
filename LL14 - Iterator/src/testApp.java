public class testApp {
    public static void main(String[] args) {
        ArrayedList<Integer> list = new ArrayedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Original list: " + list);

        // Test add(int index, T entry) method
        list.add(2, 5);
        System.out.println("After adding 5 at index 2: " + list);

        // Test remove(int index) method
        int removed = list.remove(3);
        System.out.println("After removing item at index 3: " + list);
        System.out.println("Removed item: " + removed);
    }
}