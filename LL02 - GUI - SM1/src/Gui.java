import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application {

    public void start(Stage stage) {
        stage.setTitle("SIUUU");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        scene.getRoot().setStyle("-fx-font-family: monospace");
        stage.setScene(scene);
        stage.show();
    }

    //--------------------------------------------------------------------------------

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        //--------------------------------------------------------------------------------

        Slider redSlider = new Slider(0, 255, 128);
        redSlider.setMajorTickUnit(64);
        redSlider.setMinorTickCount(8);
        redSlider.setShowTickMarks(true);

        Slider greenSlider = new Slider(0, 255, 128);
        greenSlider.setMajorTickUnit(64);
        greenSlider.setMinorTickCount(8);
        greenSlider.setShowTickMarks(true);

        Slider blueSlider = new Slider(0, 255, 128);
        blueSlider.setMajorTickUnit(64);
        blueSlider.setMinorTickCount(8);
        blueSlider.setShowTickMarks(true);

        pane.add(new Label("Red:"), 0, 0);
        pane.add(redSlider, 1, 0);
        pane.add(new Label("Green:"), 0, 1);
        pane.add(greenSlider, 1, 1);
        pane.add(new Label("Blue:"), 0, 2);
        pane.add(blueSlider, 1, 2);

        redSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            int red = newValue.intValue();
            String color = String.format("#%02X%02X%02X", red, (int) greenSlider.getValue(), (int) blueSlider.getValue());
            pane.setStyle("-fx-background: " + color + ";");
        });

        greenSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            int green = newValue.intValue();
            String color = String.format("#%02X%02X%02X", (int) redSlider.getValue(), green, (int) blueSlider.getValue());
            pane.setStyle("-fx-background: " + color + ";");
        });

        blueSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            int blue = newValue.intValue();
            String color = String.format("#%02X%02X%02X", (int) redSlider.getValue(), (int) greenSlider.getValue(), blue);
            pane.setStyle("-fx-background: " + color + ";");
        });

        //--------------------------------------------------------------------------------

//        redSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
//            int red = newValue.intValue();
//            String color = "#"+String.format("%02X", red, (int) greenSlider.getValue(), (int) blueSlider.getValue());
//            pane.setStyle("-fx-background: " + color + ";");
//        });
//
//        greenSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
//            int green = newValue.intValue();
//            String color = "#"+String.format("%02X", (int) redSlider.getValue(), green, (int) blueSlider.getValue());
//            pane.setStyle("-fx-background: " + color + ";");
//        });
//
//        blueSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
//            int blue = newValue.intValue();
//            String color = "#"+String.format("%02X", (int) redSlider.getValue(), (int) greenSlider.getValue(), blue);
//            pane.setStyle("-fx-background: " + color + ";");
//        });

    }
}
