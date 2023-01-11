import java.util.ArrayList;
import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Alice"));
        customers.add(new Customer("Bob"));
        customers.add(new Customer("Charlie"));
        customers.add(new Customer("Eve"));
        customers.sort(Customer::compareTo);

        Customer[] slowPayers = new Customer[] {
                new Customer("Bob"),
                new Customer("Charlie"),
                new Customer("Eve")
        };
        Arrays.sort(slowPayers, Customer::compareTo);

        System.out.println(customers);
        System.out.println(Arrays.toString(slowPayers));
        System.out.println();
        System.out.println("Merging: ");
        ArrayList<Customer> goodCustomers = Customer.goodCustomers(customers, slowPayers);
        for (Customer c : goodCustomers) {
            System.out.println(c.getName());
        }

        System.out.println("siu?");
        goodCustomers.forEach(c -> System.out.println(c.getName()));





    }
}
