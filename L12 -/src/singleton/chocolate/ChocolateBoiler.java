package singleton.chocolate;

public class ChocolateBoiler {
	private static ChocolateBoiler uniqueInstance;

	public static ChocolateBoiler getInstance() {
		if (uniqueInstance == null) {
			System.out.println("Creating unique instance of Chocolate Boiler");
			uniqueInstance = new ChocolateBoiler();
		}
		System.out.println("Returning instance of Chocolate Boiler");
		return uniqueInstance;
	}

	//-------------------------------------------------------------------------

	private boolean empty;
	private boolean boiled;

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	public void fill() {
		if (this.isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture
			System.out.println("Chocolate boiler filled");
		} else {
			System.out.println("Can't fill: boiler is not empty");
		}
	}

	public void drain() {
		if (!this.isEmpty() && this.isBoiled()) {
			// drain the boiled milk and chocolate
			System.out.println("Chocolate boiler emptied");
			empty = true;
		} else {
			System.out.println("Can't drain: boiler is empty or chocolade is not boiled");
		}
	}

	public void boil() {
		if (!this.isEmpty() && !this.isBoiled()) {
			// bring the contents to a boil
			System.out.println("Chocolate boiler contents boiled");
			boiled = true;
		} else {
			System.out.println("Can't boil: boiler is empty or chocolate is already boiled");
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}
