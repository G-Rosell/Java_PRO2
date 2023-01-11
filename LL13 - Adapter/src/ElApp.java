public class ElApp extends Item {


    public ElApp(double netPrice, String name) {
        super(netPrice, name);
    }

    @Override
    public double calcVAT() {
        double vat = getNetPrice() * 0.30;
        if (vat < 3 ){
            return getNetPrice() + 3;
        }
        return getNetPrice() * 0.70;
    }
}
