package exc04;

import java.util.Iterator;

public class testApp {

    public static void main(String[] args) {

        ArrayedList arr = new ArrayedList<>(10);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        Iterator it = arr.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
            // tester om exception virker
            arr.remove(0);
        }
    }
}
