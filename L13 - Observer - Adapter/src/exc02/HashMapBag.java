package exc02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapBag implements ObservableBag {

    private final Map<String, Integer> bag = new HashMap<>();
    private int count;

    // -------------------------------------------------------



    public Map<Integer, String> getBag() {
        return new HashMap<>();
    }

    @Override
    public void add(String s) {
        bag.put(s, getCount(s));
        count++;
    }

    @Override
    public void remove(String s) {
        bag.remove(s, getCount(s));
        count--;
    }

    @Override
    public int getCount(String s) {
        if (bag.isEmpty()) {
            return 0;
        }
        else {
            return count;
        }
    }
}
