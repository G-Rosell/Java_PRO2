package adapter_ducks;

import java.util.ArrayList;
import java.util.List;

public class DuckTestDrive1 {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();
        Duck wildTurkeyAdapter = new TurkeyAdapter(wildTurkey);
        List<Duck> ducks = new ArrayList<>(List.of(mallardDuck, wildTurkeyAdapter));

        for (Duck duck : ducks) {
            System.out.println("*** "+ duck + " ***");
            duck.quack();
            duck.fly();
            System.out.println();
        }
    }
}
