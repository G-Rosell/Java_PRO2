package exc02;

public abstract class shapesComponent {


    public void add(shapesComponent shapesComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(shapesComponent shapesComponent) {
        throw new UnsupportedOperationException();
    }

    public shapesComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    // ------------------------------------------------ // ------------------------------------------------ //

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}