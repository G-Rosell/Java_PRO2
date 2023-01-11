public class main {

    public static void main(String[] args) {
        Item food = new Food(100,"Pizza makker");
        Item elApp = new ElApp(100, "TV makker");
        AlcoBev alcoBev = new AlcoBev(100, "Vin makker");
        Item alcoBevAdapter = new AlcoBevAdapter(alcoBev);


        System.out.println();
        System.out.println("Vat for food: " + food.calcVAT());
        System.out.println();
        System.out.println("VAT for electrical appliance: " + elApp.calcVAT());
        System.out.println();
        System.out.println("VAT for alcoholic beverage: " + alcoBevAdapter.calcVAT());
    }
}
