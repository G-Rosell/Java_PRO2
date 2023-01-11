public class main {

    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Makker1");
        Customer c2 = new Customer(2, "Makker20");
        Customer c3 = new Customer(3, "Makker300");

        // Compare customers based on number:
        Customer.setComparator(new NumberComparator());
        System.out.println(c1.compareTo(c2));
        System.out.println(c2.compareTo(c3));
        System.out.println(c3.compareTo(c1));

        System.out.println();

        // Compare customers based on name:
        Customer.setComparator(new NameComparator());
        System.out.println(c1.compareTo(c2));
        System.out.println(c2.compareTo(c3));
        System.out.println(c3.compareTo(c1));
    }
}
