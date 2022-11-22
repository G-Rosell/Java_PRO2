package singleton.chocolate;

public class ChocolateController {
	public static void main(String[] args) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();

		System.out.println("\nUse boiler:");
		boiler.fill();
		boiler.boil();
		boiler.drain();

		System.out.println("\nUse boiler2:");
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance(); // will return the existing instance
		boiler2.boil();
		boiler2.drain();
	}
}
