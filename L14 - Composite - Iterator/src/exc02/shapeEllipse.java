package exc02;

import java.awt.*;

public class shapeEllipse extends shapesComponent {

    private String name;

    // ------------------------------------------------ // ------------------------------------------------ //

    public shapeEllipse(String name) {
        this.name = name;
    }

    // ------------------------------------------------ // ------------------------------------------------ //

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ------------------------------------------------ // ------------------------------------------------ //

    public shapeEllipse draw() {
        System.out.println("  " + getName() );
        return null;
    }

    public shapeEllipse calcCirc(Graphics g) {

        return null;
    }



}
