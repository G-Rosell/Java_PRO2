//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.GridPane;
//import javafx.stage.Modality;
//import javafx.stage.Stage;
//import javafx.stage.StageStyle;
//
//
//public class BetalingsWindow extends Stage {
//
//    public BetalingsWindow(String title, Stage owner) {
//        this.initOwner(owner);
//        this.initStyle(StageStyle.UTILITY);
//        this.initModality(Modality.APPLICATION_MODAL);
//        this.setMinHeight(100);
//        this.setMinWidth(200);
//        this.setResizable(true);
//
//
//        this.setTitle(title);
//        GridPane pane = new GridPane();
//        this.initContent(pane);
//
//        Scene scene = new Scene(pane);
//        this.setScene(scene);
//    }
//
//    // -------------------------------------------------------------------------
//    private final TextField txfSiu = new TextField();
//
//
//    private void initContent(GridPane pane) {
//        pane.setGridLinesVisible(false);
//        pane.setPadding(new Insets(20));
//        pane.setHgap(10);
//        pane.setVgap(10);
//
//        // Siu
//        Label lblTitel = new Label("Siu");
//        pane.add(lblTitel, 0, 0);
//
//
//
//
//
//
//
//        // -------------------------------------------------------------------------
//
//        // Button actions
//
//    }
//}
