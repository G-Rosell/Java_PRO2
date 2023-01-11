public class AlcoBev {
    private double theNetPrice;
    private String theDescription;

    public AlcoBev(double theNetPrice, String theDescription) {
        this.theNetPrice = theNetPrice;
        this.theDescription = theDescription;
    }

    // -----------------------------------------------------------------------------------------------------------------


    public double getTheNetPrice() {
        return theNetPrice;
    }

    public void setTheNetPrice(double theNetPrice) {
        this.theNetPrice = theNetPrice;
    }

    public String getTheDescription() {
        return theDescription;
    }

    public void setTheDescription(String theDescription) {
        this.theDescription = theDescription;
    }

    // -----------------------------------------------------------------------------------------------------------------

    public double getVat() {
        if (theNetPrice > 150) {
            return theNetPrice * 1.20;
        }
        return theNetPrice * 0.80;
    }
}
