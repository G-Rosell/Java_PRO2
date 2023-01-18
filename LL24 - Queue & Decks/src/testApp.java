public class testApp {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.addPerson(new Person("Makker John"));
        circle.addPerson(new Person("Makker Hitler"));
        circle.addPerson(new Person("Makker Egon"));
        circle.addPerson(new Person("Makker Olsen"));
        System.out.println("-----------------------------------------------");

        // Printing circle
        System.out.println("Printing circle:");
        System.out.println();
        circle.printPersons();
        System.out.println("-----------------------------------------------");

        // Testing method; remove first
        System.out.println("Testing method; remove first: ");
        System.out.println();
        Person removed = circle.removeFirst();
        System.out.println("Removed: " + removed.getName());
        System.out.println();
        System.out.println("List after removing:");
        circle.printPersons();
        System.out.println("-----------------------------------------------");

        // Testing method; remove last
        System.out.println("Testing method; remove last: ");
        System.out.println();
        removed = circle.removeNext(3);
        System.out.println("Removed: " + removed.getName());
        System.out.println();
        System.out.println("List after removing:");
        circle.printPersons();
        System.out.println("-----------------------------------------------");






    }

}
