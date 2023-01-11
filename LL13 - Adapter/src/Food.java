public class Food extends Item {


    public Food(double netPrice, String name) {
        super(netPrice, name);
    }

    @Override
    public double calcVAT() {
        return getNetPrice() * 0.05;
    }
}
