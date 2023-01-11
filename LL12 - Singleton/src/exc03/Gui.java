package exc03;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
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
    TextField nameField = new TextField();
    Button addButton = new Button("Add");
    ListView<Person> lvwPerson = new ListView<>();
    Label lbl = new Label("Name:");

        private void initContent(GridPane pane) {
            pane.setGridLinesVisible(false);
            pane.setPadding(new Insets(20));
            pane.setHgap(10);
            pane.setVgap(10);

            pane.add(lbl, 0, 0);
            pane.add(nameField, 1, 0);
            pane.add(addButton,2,0);
            pane.add(lvwPerson, 0, 1,3,2);

            addButton.setOnAction(event -> btnAction());


    }

    private void btnAction() {
            String name = nameField.getText();
            Controller.addPerson(name);
            lvwPerson.getItems().add(new Person(name));
            nameField.clear();
    }
}

