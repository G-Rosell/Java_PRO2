package demoiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoIterator {

    public static void main(String[] args) {
        List<Runner> runners = List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)
        );

        System.out.println("All runners:");
        Iterator<Runner> it1 = runners.iterator();
        while (it1.hasNext()) {
            Runner runner = it1.next();
            System.out.println(runner.getName() + " " + runner.getLapTime() + " sec");
        }
        System.out.println();

        System.out.println("All runners with laptime < 40 sec:");
        Iterator<Runner> it2 = runners.iterator();
        while (it2.hasNext()) {
            Runner runner = it2.next();
            if (runner.getLapTime() < 40) {
                System.out.println(runner.getName() + " " + runner.getLapTime() + " sec");
            }
        }
    }
    
   // for-each sætningen er syntaktisk sukker for en iterator.
}
