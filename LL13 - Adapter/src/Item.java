public class Item {

    private double netPrice;
    private String name;

    public Item(double netPrice, String name) {
        this.netPrice = netPrice;
        this.name = name;
    }

    // -----------------------------------------------------------------------------------------------------------------


    public double getNetPrice() {
        return netPrice;
    }

    public String getName() {
        return name;
    }

    public void setNetPrice(double price) {
        this.netPrice = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calcVAT() {
        return 0;
    }

}
/*

                       Item
                      /   \
                     /     \
                  Food      ElApp
                     \     /
                      \   /
                  AlcoBevAdapter
*/
