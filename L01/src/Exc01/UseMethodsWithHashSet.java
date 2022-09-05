package Exc01;

import java.util.HashSet;

public class UseMethodsWithHashSet {


         // a)
    public static void main(String[] args) {
        HashSet<Integer> tal = new HashSet<>();

        // b)
        tal.add(4);
        tal.add(12);
        tal.add(23);
        tal.add(45);
        tal.add(67);
        tal.add(34);
        tal.add(98);

        // c)

        System.out.println(tal);

        // d)

        tal.add(23);

        // e)

        System.out.println(tal);

        // f)

        tal.remove(67);

        // g)

        System.out.println(tal);

        // h)

        System.out.println(tal.contains(23));

        // i)

        System.out.println(tal.size());
        // eller:
        System.out.println(tal.stream().count());

    }
}
