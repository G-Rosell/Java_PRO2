public class AlcoBevAdapter extends Item {

    private AlcoBev alcoBev;


    public AlcoBevAdapter(AlcoBev alcoBev) {
        super(alcoBev.getTheNetPrice(), alcoBev.getTheDescription());
        this.alcoBev = alcoBev;
    }

    @Override
    public double calcVAT() {
        return alcoBev.getVat();
    }
}
