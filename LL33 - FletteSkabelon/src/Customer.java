import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;

public class Customer implements Comparable<Customer> {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Customer other) {
        return this.name.compareTo(other.name);
    }

    /**
     * Return a sorted ArrayList containing all customers
     * from l1 that are not in l2.
     * Pre: l1 and l2 are sorted and l2 has no empty
     * entries.
     */

//    public static ArrayList<Customer> goodCustomers(ArrayList<Customer> l1, Customer[] l2) {
//        ArrayList<Customer> goodCustomers = new ArrayList<>(l1);
//        Arrays.sort(l2);
//        for (Customer customer : l2) {
//            goodCustomers.removeIf(c -> c.getName().equals(customer.getName()));
//        }
//        return goodCustomers;
//    }

    public static ArrayList<Customer> goodCustomers(ArrayList<Customer> l1, Customer[] l2) {
        ArrayList<Customer> goodCustomers = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < l1.size() && j < l2.length) {
            int compare = l1.get(i).getName().compareTo(l2[j].getName());
            if (compare < 0 ) {
                goodCustomers.add(l1.get(i++));
            }else if (compare == 0) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        while (i < l1.size()){
            goodCustomers.add(l1.get(i++));
        }
        return goodCustomers;
    }

    @Override
    public String toString() {
        return name;
    }


}
