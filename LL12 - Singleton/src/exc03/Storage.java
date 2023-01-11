package exc03;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private static Storage instance;
    private List<Person> names;

    private Storage() {
        names = new ArrayList<>();
    }

    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }

    public void addPerson(Person p) {
        names.add(p);
    }

    public List<Person> getNames() {
        return new ArrayList<>(names);
    }
}
