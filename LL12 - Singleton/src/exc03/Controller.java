package exc03;

public class Controller {

    private static Storage storage = Storage.getInstance();

    public static void addPerson(String name) {
        Person p = new Person(name);
        storage.addPerson(p);
    }
}
