package observer_ex3student;

public class Purchaser {
    private final String name;

    public Purchaser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void purchaseBook(Book b, int amount) {
        System.out.println("Purchase: " + b + ", " + amount + " copies");
        b.incCount(amount);
    }
}
