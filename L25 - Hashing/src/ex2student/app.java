package ex2student;

import java.lang.reflect.Array;

public class app {
    public static void main(String[] args) {
        HashSetSC hashSetSC = new HashSetSC<>(7);

//      double tal = 1;
//        for (double i = 0.1; i <= tal; i++) {
//            hashSetSC.add(i);
//        }
        System.out.println("--------------------Testing method; add:--------------------");
        hashSetSC.add(1);
        hashSetSC.add(2);
        hashSetSC.add(3);
        hashSetSC.add(4);
        hashSetSC.add(5);
        hashSetSC.add(6);
        hashSetSC.add(7);
        hashSetSC.add(8);
        hashSetSC.add(9);
        hashSetSC.add(10);
        System.out.println(hashSetSC);

        System.out.println("--------------------Testing method; contains:--------------------");
        System.out.println("If contains 10: " + hashSetSC.contains(10));

        System.out.println("--------------------Testing method: remove:----------------------");
        System.out.println("Removing 1: " + hashSetSC.remove(1));
        System.out.println("Removing 2: " + hashSetSC.remove(2));
        System.out.println("Removing 3: " + hashSetSC.remove(3));
        System.out.println("Contains 1: " + hashSetSC.contains(1));
        System.out.println("Contains 2: " + hashSetSC.contains(2));
        System.out.println("Contains 3: " + hashSetSC.contains(3));
        System.out.println("Contains 4: " + hashSetSC.contains(4));


        System.out.println("--------------------Testing method; size:------------------------");
        System.out.println("Size: " + hashSetSC.size());
        System.out.println("--------------------SIUUUUUUUUUUUUUUUUUUU------------------------");



    }
}
