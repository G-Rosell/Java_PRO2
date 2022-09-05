package Exc01;

import java.util.HashSet;

public class UseMethodsWithHashSet {

    public static void main(String[] args) {

        HashSet<Integer> tal = new HashSet<>();
        tal.add(34);
        tal.add(12);
        tal.add(23);
        tal.add(45);
        tal.add(67);
        tal.add(34);
        tal.add(98);


        //
        System.out.println(tal);

        tal.add(23);

        System.out.println(tal);

        tal.remove(67);

        System.out.println();

        tal.contains(23);

        System.out.println(tal);

        System.out.println(tal.contains(23));

        System.out.println(tal.stream().count());

    }
}
